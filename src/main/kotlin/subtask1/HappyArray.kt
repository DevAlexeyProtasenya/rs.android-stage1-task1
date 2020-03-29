package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.isEmpty()) {
            return sadArray;
        } else {
            var happyArray = IntArray(sadArray.size)
            happyArray[0] = sadArray[0]
            var j = 1;
            var lastValidInt = sadArray[0];
            for (i in 1 until sadArray.size - 1) {
                if (sadArray[i] <= lastValidInt + sadArray[i + 1]) {
                    happyArray[j] = sadArray[i]
                    lastValidInt = sadArray[i]
                    j++
                } else {
                    if (j != 1 && j != sadArray.size - 1) {
                        while (happyArray[j - 1] > (happyArray[j - 2] + sadArray[i + 1])) {
                            j--;
                        }
                    }
                }
            }
            happyArray[j] = sadArray[sadArray.size - 1]
            return happyArray.copyOf(j + 1)
        }
    }
}
