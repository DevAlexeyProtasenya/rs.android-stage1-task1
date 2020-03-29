package subtask2

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        return intArrayOf(input.sum() - input.max()!!, input.sum() - input.min()!!)
    }
}
