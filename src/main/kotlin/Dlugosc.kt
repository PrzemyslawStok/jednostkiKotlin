class Dlugosc(var dlugoscMetry: Double) {

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

    fun toMilimeters():Double{
        return 0.0
    }

    fun toCentymeters():Double{
        return 0.0
    }


    fun print() {
        println("Dlugość wynosi: ${dlugoscMetry}[m]")
    }

}
