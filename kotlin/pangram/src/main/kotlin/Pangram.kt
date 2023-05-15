object Pangram {

    fun isPangram(input: String): Boolean {
        val chars = 'a'..'z'
        for (c in chars){
            if (c !in input.lowercase().toCharArray()){
                return false
            }
        }
        return true
    }
}
