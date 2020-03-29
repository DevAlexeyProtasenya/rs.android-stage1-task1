package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var isPossible = 0
        var result = ""
        for (i in 0 until n / 2) {
            if (digitString[i] != digitString[n - i - 1])
                isPossible++
        }

        if (n % 2 != 0 && isPossible == 0) {
            for (i in 1 until n) {
                if (i != n / 2 + 1) {
                    result += digitString[i]
                } else {
                    result += '9'
                }
            }
        }

        if (isPossible > k) {
            result = "-1"
        }

        if (isPossible == k){
            for (i in 0 until n) {
                if (digitString[i] != digitString[n - i - 1]) {
                    if (digitString[i] > digitString[n - i - 1]) {
                        result += digitString[i]
                    } else
                        result += digitString[n - i - 1]
                } else {
                    result += digitString[i]
                }
            }
        }

        if (k - isPossible >= 1){
            for (i in 0 until n) {
                if (digitString[i] != digitString[n - i - 1]) {
                    if (digitString[i] > digitString[n - i - 1]) {
                        result += digitString[i]
                    } else
                        result += digitString[n - i - 1]
                } else {
                    result += digitString[i]
                }
            }
            var result2 = ""
            if(result[0] != '9'){

                result2 += '9'
                for(i in 1 until n-1)
                    result2 += result[i]
                result2 += '9'
            }
            result = result2
        }

        return result
    }
}
