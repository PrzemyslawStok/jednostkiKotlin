class Czas(var czasSekundy: Double) {
    enum class Jednostka(val mnoznik: Double) {
        SEKUNDA(1.0),
        MINUTA(60.0),
        GODZINA(3600.0),
    }

    companion object {
        fun fromMinutes(czasMinuty: Double): Czas {
            return Czas(czasMinuty * 60)
        }
    }

    fun toMinutes(): Double {
        return czasSekundy / 60
    }

    fun printMinutes() {
        println("Czas wynosi: ${toMinutes()} [m]")
    }

    fun print() {
        println("Czas wynosi: ${czasSekundy} [s]")
    }
}
