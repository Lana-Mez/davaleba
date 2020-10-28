fun main() {
    val f3 = Fraction()
    f3.numerator=4F
    f3.denominator=10F

    val f4 = Fraction()
    f4.numerator=6F
    f4.denominator=8F

    val f5 = (f3.numerator * f4.numerator) / (f3.denominator * f4.denominator)
    print( f5 )

}