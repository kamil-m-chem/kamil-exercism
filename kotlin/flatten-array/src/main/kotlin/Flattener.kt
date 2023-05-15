object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        val plainList = ArrayList<Any>()
        fun getElementsFromCollection(deeperSource: Collection<Any?>) {
            for (element in deeperSource){
                if(element is Collection<*>){
                    getElementsFromCollection(element)
                } else {
                    if (element != null) {
                        plainList.add(element)
                    }
                }
            }
        }
        getElementsFromCollection(source)
        return plainList
    }
}
