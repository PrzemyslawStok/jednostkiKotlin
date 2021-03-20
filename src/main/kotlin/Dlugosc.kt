class Dlugosc(var dlugoscMetry: Double) {
     enum class Jednostka(val mnoznik: Double) {
        MILIMETR(0.001),
        CENTYMETR(0.01),
        METR(1.0),
        KILOMETR(1000.0)
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

        fun fromUnit(dlugosc: Double, jednostka: Dlugosc.Jednostka): Dlugosc {
            return Dlugosc(dlugosc * jednostka.mnoznik)
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

    fun printKilometers() {
        println("Dlugość wynosi: ${toKilometers()}[km]")
    }

    fun printMilimeters() {
        println("Dlugość wynosi: ${toMilimeters()}[mm]")
    }

    fun printCentymeters() {
        println("Dlugość wynosi: ${toCentymeters()}[cm]")
    }

    fun printMeters() {
        print()
    }

    fun print() {
        println("Dlugość wynosi: ${dlugoscMetry}[m]")
    }

    fun print(jednostka: Jednostka){
        when(jednostka){
            Jednostka.MILIMETR->printMilimeters()
            Jednostka.CENTYMETR->printCentymeters()
            Jednostka.METR->printMeters()
            Jednostka.KILOMETR->printKilometers()
        }
    }

}
