package subtask3

class BillCounter {

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val annCost = (bill.sum()-bill[k])/2
        var result: String
        if (annCost == b){
            result = "Bon Appetit"
        } else {
            result = (b - annCost).toString()
        }
        return result
    }
}
