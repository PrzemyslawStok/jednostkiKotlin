fun main() {
    val dlugosc0 = Dlugosc(0.1)

    dlugosc0.print()

    val dlugosc1 = Dlugosc.fromKilometers(10.0)

    dlugosc1.print()

    val dlugosc2 = Dlugosc.fromCentymeters(10.0)
    dlugosc2.print()

    println("dlogosc2 ${dlugosc2.toKilometers()} [km]")

    println("${Dlugosc.fromCentymeters(2.0).toMilimeters()}")

    Dlugosc.fromCentymeters(100.0).printMilimeters()
    Dlugosc.fromCentymeters(100.0).print()

    val czas0 = Czas(10.0)
    czas0.print()

    Czas.fromMinutes(10.0).print()

}
