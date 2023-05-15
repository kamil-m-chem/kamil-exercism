object HandshakeCalculator {
    fun calculateHandshake(number: Int): List<Signal> {
        var zeroAndOneList: List<Int> = Integer.toBinaryString(number).toString().toCharArray()
            .map { Character.getNumericValue(it) }
            .toList().reversed()
        val signalList:ArrayList<Signal> = ArrayList<Signal> ()
        val signals = Signal.values()
        for (i in 0 until zeroAndOneList.size){
            if (i > 3) break
            if (zeroAndOneList[i] == 1){
                signalList.add(signals[i])
            }
        }
        if(zeroAndOneList.size >= 5 ){
            return signalList.reversed()
        }
        return signalList
    }
}
