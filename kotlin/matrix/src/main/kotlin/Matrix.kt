fun main() {
    val matrix = "1 2\n10 20"
    println(Matrix(matrix).getRows())
}
class Matrix(private val matrixAsString: String) {

    fun column(colNr: Int): List<Int> {
        val theColumn = getColumns()[(colNr-1)]
        if (theColumn != null   ) {
            return theColumn.toList()
        }
        return  emptyList()
    }


    fun row(rowNr: Int): List<Int> {
        val theRow = getRows()[rowNr - 1] //matrix starts from 1
        val rowAsIntList = ArrayList<Int>()
        val splited = theRow.split(" ")
        for (c in splited) {
            val tempInt = c.toIntOrNull()
            if(tempInt != null)
                rowAsIntList.add(c.toInt())
        }
        return rowAsIntList
    }

    fun getRows(): List<String> {
        val rows = matrixAsString.split("\n")
        println("ROWS: $rows")
        return rows
    }

    private fun getColumns(): Map<Int, MutableList<Int>> {
        val numberOfRows = getRows().size
        val numbersOfColumns = row(1).size
        val columns = HashMap<Int, MutableList<Int>>()

        for (i in 0 until  numberOfRows) {
            for (columnIndex in 0 until numbersOfColumns){
                val columnListWithIndex: MutableList<Int> = columns.getOrDefault(columnIndex, ArrayList())
                val numberToAdd = row(i+1)[columnIndex]
                columnListWithIndex.add(numberToAdd)
                columns[columnIndex] = columnListWithIndex
            }
        }
        return columns

    }
}
