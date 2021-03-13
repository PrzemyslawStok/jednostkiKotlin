class Czas(var czasSekundy: Double) {
    companion object {
        fun fromMinutes(czasMinuty: Double): Czas {
            return Czas(czasMinuty * 60)
        }
    }

    fun toMinutes():Double{
        return 0.0
    }

    fun printMinutes(){
        println("Czas wynosi: ${toMinutes()} [m]")
    }

    fun print(){
        println("Czas wynosi: ${czasSekundy} [s]")
    }
}
