package minimizemutability

/**
 * @author Sergey Chistyakov <serge.chistyakov@gmail.com>
 *         21.06.2017
 */

data class KComplex constructor(private val re: Double, private val im: Double) {

    // Accessors with no corresponding mutators
    fun realPart() = re
    fun imaginaryPart()= im

    fun add(c: KComplex) = KComplex(re + c.re, im + c.im)

    fun subtract(c: KComplex)= KComplex(re - c.re, im - c.im)

    fun multiply(c: KComplex) = KComplex(re * c.re - im * c.im, re * c.im + im * c.re)

    fun divide(c: KComplex): KComplex {
        val tmp = c.re * c.re + c.im * c.im
        return KComplex((re * c.re + im * c.im) / tmp, (im * c.re - re * c.im) / tmp)
    }

    companion object {

        fun valueOf(re: Double, im: Double) = KComplex(re, im)
        fun valueOfPolar(r: Double, theta: Double) = KComplex(r * Math.cos(theta), r * Math.sin(theta))

        val ZERO = KComplex(0.0, 0.0)
        val ONE = KComplex(1.0, 0.0)
        val I = KComplex(0.0, 1.0)
    }
}