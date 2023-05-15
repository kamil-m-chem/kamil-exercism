package main.kotlin

fun main(args: Array<String>) {
val left = "AABBAB"
val right = "ABBBAC"
val result = Hamming.compute(left,right)
println(result)

}

object Hamming {


    fun compute(left: String, right: String) =
        if (left.length == right.length)

            left.zip(right){ l, r -> l != r }.count({a -> a})
        else
            throw IllegalArgumentException("left and right strands must be of equal length.")

}

class Main {

}