object Isogram {

    fun isIsogram(input: String): Boolean {
        val chars = input.lowercase().toCharArray();
        val map = HashMap<Char, Int>();
        var currentCharCounter = 0;
        for(c in chars){
            currentCharCounter = map.getOrDefault(c,0);
            if (!c.equals(' ') && !c.equals('-')) {
                map.put(c,++currentCharCounter)
            }
            if (currentCharCounter > 1){
                return false
            }
        }
        return true
    }
}
