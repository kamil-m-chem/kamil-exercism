import kotlin.math.max

fun main(){
val matrix = Matrix(
    listOf(
        listOf(1, 2, 3, 4),
        listOf(5, 6, 7, 8),
        listOf(9, 10, 11, 12)
    )
    )
println(matrix.columns())
}
data class MatrixCoordinate(val row: Int, val col: Int)
class Matrix (val rows: List<List<Int>>) {
    fun saddlePoints(): Set<MatrixCoordinate>{

        val columns = columns()
        val columnMin = columns.map { it.minOrNull() }
        val rowMax = rows.map { it.maxOrNull() }

        for (c in columns.indices) {
            for (r in rows[c]){
                if (rows[c][r] == )
            }
        }
        return HashSet<MatrixCoordinate>()
    }
    fun columns()  = (0 until rows[0].size).map { i -> rows.map { it[i] } }

}
