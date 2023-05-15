import java.lang.IllegalArgumentException

object Hamming {

    fun compute2(leftStrand: String, rightStrand: String): Int {
       if (leftStrand.length != rightStrand.length)
           throw IllegalArgumentException("\"left and right strands must be of equal length\"")
       var hammingLength: Int = 0
       val leftStrandCharArray = leftStrand.toCharArray()
       val rightStrandCharArray = rightStrand.toCharArray()
       for (i in 0..leftStrandCharArray.size-1) {
           if (!leftStrandCharArray[i].equals(rightStrandCharArray[i])){
               hammingLength++
           }
        }
        return hammingLength
    }
    fun compute(leftStrand: String, rightStrand: String): Int {
        require(leftStrand.length==rightStrand.length)
        return leftStrand.zip(rightStrand) {a,b -> a!=b}.count({it})
    }
}
