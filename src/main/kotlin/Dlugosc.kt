class Dlugosc(var dlugoscMetry: Double) {
    enum class Jednostka(val mnoznik: Double) {
        MILIMETRY(0.001),
        CENTYMETRY(0.01),
        METRY(1.0),
        KILOMETRY(1000.0)
    }

    companion object {
        fun fromKilometers(dlugoscKilometry: Double): Dlugosc {
            return Dlugosc(dlugoscKilometry * 1000)
        }

        fun fromMilimeters(dlugoscMilimetry: Double): Dlugosc {
            return Dlugosc(dlugoscMilimetry * 0.001)
        }

        fun fromCentymeters(dlugoscCentymetry: Double): Dlugosc {
            return Dlugosc(dlugoscCentymetry * 0.01)
        }
    }

    fun toKilometers(): Double {
        return dlugoscMetry * 0.001
    }

    fun toMilimeters(): Double {
        return dlugoscMetry * 1000
    }

    fun toCentymeters(): Double {
        return dlugoscMetry * 100
    }

    fun printKilometers(){
        println("Dlugość wynosi: ${toKilometers()}[km]")
    }

    fun printMilimeters(){
        println("Dlugość wynosi: ${toMilimeters()}[mm]")
    }

    fun printCentymeters(){
        println("Dlugość wynosi: ${toCentymeters()}[cm]")
    }

    fun printMeters(){
        print()
    }

    fun print() {
        println("Dlugość wynosi: ${dlugoscMetry}[m]")
    }

}
