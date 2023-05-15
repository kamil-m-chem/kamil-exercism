object WordCount {

    fun phrase(phrase: String): Map<String, Int> =
        phrase
            .lowercase()
            .split(' ', ',', '\n')
            .map { it.replace("""[^0-9a-z']""".toRegex(), "") }
            .map { it.trim('\'') }
            .filterNot { it.isEmpty() }
            .groupBy { it }.mapValues { it.value.size }


    fun phrase2(phrase: String): Map<String, Int> {
        var currentCount: Int = 0
        val wordList = phrase.lowercase().split(' ', ',', '\n')
        val wordListTrimered: MutableList<String> = ArrayList<String>();
        val filteredList = wordList.filter { i -> i != "" }
        filteredList.forEach { i -> wordListTrimered.add(i.replace("""[:,.!&@$%^&\n ]+""".toRegex(), "")) }
        val wordsOccurencies = HashMap<String, Int>()
        for (s in wordListTrimered) {
            var wordWithoutQuotation = s
            if (s.startsWith('\'') && s.endsWith('\'')) {
                wordWithoutQuotation = s.substring(1, s.length - 1)
            }
            currentCount = wordsOccurencies.getOrDefault(wordWithoutQuotation, 0);
            wordsOccurencies.put(wordWithoutQuotation, ++currentCount)
        }
        return wordsOccurencies
    }
}
