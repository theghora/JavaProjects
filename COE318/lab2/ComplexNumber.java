package coe318.lab2;

/**
 * ComplexNumber models a complex number expressed in rectangular form (real and
 * imaginary parts). It is an <em>immutable</em> object.
 *
 * @author Taha Ghori
 */
public class ComplexNumber {
//Instance variable declarations
    private double reals;
    private double imagines;
    /**
     *
     *
     * @param re The real component
     * @param im The imaginary component
     */
    public ComplexNumber(double re, double im) {
        reals = re;
        imagines=im;     
    }

    /**
     * Returns the real component.
     *
     * @return the real
     */
    public double getReal() {
        return reals;	//A stub: to be fixed
    }

    /**
     * Returns the imaginary component.
     *
     * @return the imaginary
     */
    public double getImaginary() {
        return imagines;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber number that is the negative of <em>this</em>.
     * Note: the original ComplexNumber is <b>NOT</b>
     * modified.
     *
     * @return -this
     */
    public ComplexNumber negate() {
        ComplexNumber sx;
        sx = new ComplexNumber(this.reals, this.imagines);
        sx.reals *= -1;
        sx.imagines *= -1;
        return sx; //A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the sum of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber add(ComplexNumber z) {
        ComplexNumber sx;
        sx = new ComplexNumber(this.reals, this.imagines);
        sx.reals = this.reals + z.reals;
        sx.imagines = this.imagines + z.imagines;
        return sx;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the difference of <em>this</em>	and
     * <em>z</em>. Note: the	original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this + z
     */
    public ComplexNumber subtract(ComplexNumber z) {
        ComplexNumber sx;
        sx = new ComplexNumber(this.reals, this.imagines);
        sx.reals = this.reals - z.reals;
        sx.imagines = this.imagines - z.imagines;
        return sx;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the product of <em>this</em> and
     * <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this * z
     */
    public ComplexNumber multiply(ComplexNumber z) {
        ComplexNumber sx;
        sx = new ComplexNumber(this.reals, this.imagines);
        sx.reals = (this.reals * z.reals) - (this.imagines * z.imagines);
        sx.imagines = (this.reals * z.imagines) + (this.imagines * z.reals);
        return sx;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is the reciprocal of <em>this</em>.
     * Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @return 1.0 / this
     */
    public ComplexNumber reciprocal() {
        double u;
        ComplexNumber x,y,p;
        x = new ComplexNumber(0, 0);
        y = new ComplexNumber(0, 0);
        p = new ComplexNumber(0, 0);
        y.reals = this.reals;
        y.imagines = this.imagines * -1;
        x.reals = this.reals * this.reals;
        x.imagines = this.imagines * this.imagines;
        u=x.reals+x.imagines;
        p.reals = y.reals / u;
        p.imagines = y.imagines / u;
        return p;	//A stub: to be fixed
    }

    /**
     * Returns a new ComplexNumber that is
     * <em>this</em> divided by <em>z</em>. Note: the original ComplexNumber is
     * <b>NOT</b> modified.
     *
     * @param z
     * @return this / z
     */
    public ComplexNumber divide(ComplexNumber z) {
        ComplexNumber sx;
        sx = new ComplexNumber(this.reals, this.imagines);
        sx.reals = ((this.reals * z.reals) + (this.imagines * z.imagines))
                / ((z.reals * z.reals) + (z.imagines * z.imagines));
        sx.imagines = ((this.imagines * z.reals) - (this.reals * z.imagines))
                / ((z.reals * z.reals) + (z.imagines * z.imagines));
        return sx;	//A stub: to be fixed
    }

    /**
     * Returns a String representation of
     * <em>this</em> in the format:
     * <pre>
     *	real +-(optional) i imaginary
     * </pre> If the imaginary part is zero, only the real part is converted to
     * a String. A "+" or "-" is placed between the real and imaginary parts
     * depending on the sign of the imagrinary part.
     * <p>
     * Examples:
     * <pre>
     *	..println(new ComplexNumber(0,0); -> "0.0"
     *	..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
     *	..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
     * </pre>
     *
     * @return the String representation.
     */
    @Override
    public String toString() {
//DO NOT MODIFY THIS CODE!
        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}
