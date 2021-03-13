fun main() {
    val dlugosc0 = Dlugosc(0.1)

    dlugosc0.print()

    val dlugosc1 = Dlugosc.fromKilometers(10.0)

    dlugosc1.print()


    val dlugosc2 = Dlugosc.fromMilimeters(10.0)

    dlugosc2.print()

}
