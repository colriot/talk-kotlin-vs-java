package minimizemutability;

/**
 * @author Sergey Chistyakov <serge.chistyakov@gmail.com>
 *         21.06.2017
 *
 *         example from effective java
 */
public final class JComplex {
        private final double re;
        private final double im;

        private JComplex(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public static JComplex valueOf(double re, double im) {
            return new JComplex(re, im);
        }

        public static JComplex valueOfPolar(double r, double theta) {
            return new JComplex(r * Math.cos(theta), r * Math.sin(theta));
        }

        public static final JComplex ZERO = new JComplex(0, 0);
        public static final JComplex ONE = new JComplex(1, 0);
        public static final JComplex I = new JComplex(0, 1);

        // Accessors with no corresponding mutators
        public double realPart() {
            return re;
        }

        public double imaginaryPart() {
            return im;
        }

        public JComplex add(JComplex c) {
            return new JComplex(re + c.re, im + c.im);
        }

        public JComplex subtract(JComplex c) {
            return new JComplex(re - c.re, im - c.im);
        }

        public JComplex multiply(JComplex c) {
            return new JComplex(re * c.re - im * c.im, re * c.im + im * c.re);
        }

        public JComplex divide(JComplex c) {
            double tmp = c.re * c.re + c.im * c.im;
            return new JComplex((re * c.re + im * c.im) / tmp, (im * c.re - re
                    * c.im)
                    / tmp);
        }

        @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;
            if (!(o instanceof JComplex))
                return false;
            JComplex c = (JComplex) o;

            // See page 43 to find out why we use compare instead of ==
            return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
        }

        @Override
        public int hashCode() {
            int result = 17 + hashDouble(re);
            result = 31 * result + hashDouble(im);
            return result;
        }

        private int hashDouble(double val) {
            long longBits = Double.doubleToLongBits(re);
            return (int) (longBits ^ (longBits >>> 32));
        }

        @Override
        public String toString() {
            return "(" + re + " + " + im + "i)";
        }

}
