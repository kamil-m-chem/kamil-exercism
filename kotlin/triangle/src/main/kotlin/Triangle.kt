import java.util.*

class Triangle<out T : Number>(val a: T, val b: T, val c: T) {

    init {
        if (a.equals(0) && (b.equals(0) && c.equals(0)))
            throw IllegalArgumentException()

        val list = listOf(a,b,c).sortedBy { it.toFloat() }
        if(list[0].toFloat() + list[1].toFloat() < list[2].toFloat())
            throw IllegalArgumentException("triangle inequality violation")
    }

    val isEquilateral: Boolean =
         (a.equals(b)) && (b.equals(c))


    val isIsosceles: Boolean =
         (a.equals(b)) || (b.equals(c)) || a.equals(c)

    val isScalene: Boolean =
             (!a.equals(b)) && !(b.equals(c)) && !a.equals(c)

}
