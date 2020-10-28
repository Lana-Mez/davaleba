fun main() {
    val f1 = Fraction()
    f1.numerator=1F
    f1.denominator=2F

    val f2 = Fraction()
    f2.numerator=2F
    f2.denominator=8F

    val f = (f1.numerator + f2.numerator) / (f1.denominator + f2.denominator)
    print(f)




}

class Fraction {
    var numerator: Float = 0F
    var denominator: Float = 1F
    }

