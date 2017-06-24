package minimizemutability

/**
 * @author Sergey Chistyakov <serge.chistyakov@gmail.com>
 *         21.06.2017
 */
data class KComplex(val re: Double, val im: Double) {
  // Classes are final by default. Methods are final and public by default.
  // Getters provided automatically for `val`s. For `var`s both getters and setters are provided.

  fun add(c: KComplex) = KComplex(re + c.re, im + c.im)

  fun subtract(c: KComplex) = KComplex(re - c.re, im - c.im)

  fun multiply(c: KComplex) = KComplex(re * c.re - im * c.im, re * c.im + im * c.re)

  fun divide(c: KComplex): KComplex {
    val tmp = c.re * c.re + c.im * c.im
    return KComplex((re * c.re + im * c.im) / tmp, (im * c.re - re * c.im) / tmp)
  }

  companion object {
    val ZERO = KComplex(0.0, 0.0)
    val ONE = KComplex(1.0, 0.0)
    val I = KComplex(0.0, 1.0)
  }
}

// This class is open for extension.
open class Point(open val x: Int, open val y: Int, private var color: Int)
