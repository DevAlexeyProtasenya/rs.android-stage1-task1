package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        var amount = 0;
        for (i in inputString.indices){
            if(inputString[i] == '(' || inputString[i] == '[' || inputString[i] == '<')
                amount++
        }
        var subString: String;
        var amountOfSimilar: Int;
        var substrings = Array(amount) {""}
        amount = 0
        for(i in inputString.indices){
            amountOfSimilar = 1
            subString = ""
            when (inputString[i]) {
                '[' -> for (j in i + 1 until inputString.length) {
                    if (inputString[j] == '[') {
                        amountOfSimilar++
                    }
                    if (inputString[j] != ']') {
                        subString += inputString[j];
                    } else {
                        if (amountOfSimilar == 1) {
                            substrings[amount] = subString
                            amount++
                        } else {
                            amountOfSimilar--;
                            subString += inputString[j];
                        }

                    }
                }
                '(' -> for (j in i + 1 until inputString.length) {
                    if (inputString[j] == '(') {
                        amountOfSimilar++
                    }
                    if (inputString[j] != ')') {
                        subString += inputString[j];
                    } else {
                        if (amountOfSimilar == 1) {
                            substrings[amount] = subString
                            amount++
                        } else {
                            amountOfSimilar--;
                            subString += inputString[j];
                        }

                    }
                }
                '<' -> for (j in i + 1 until inputString.length) {
                    if (inputString[j] == '<') {
                        amountOfSimilar++
                    }
                    if (inputString[j] != '>') {
                        subString += inputString[j]
                    } else {
                        if (amountOfSimilar == 1) {
                            substrings[amount] = subString
                            amount++
                            break
                        } else {
                            amountOfSimilar--
                            subString += inputString[j]
                        }
                    }

                }
            }
        }
        return substrings
    }
}
