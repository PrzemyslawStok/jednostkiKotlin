class Dlugosc(var dlugoscMetry: Double) {

    companion object {
        fun fromKilometers(dlugoscKilometry: Double): Dlugosc {
            return Dlugosc(dlugoscKilometry * 1000)
        }
        fun fromMilimeters(dlugoscMilimetry: Double): Dlugosc {
            return Dlugosc(dlugoscMilimetry * 0.001)
        }
        fun fromCentymeters(){

        }
    }

    fun print(){
        println("Dlugość wynosi: ${dlugoscMetry}[m]")
    }

}
