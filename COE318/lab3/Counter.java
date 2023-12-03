/**
 *
 * @author Taha Ghori
 */
package coe318.lab3;
public class Counter {
    public int moduluss;
    public Counter leftt;
    public int digitt = 0;
    public int counter = 0;

    public Counter(int modulus, Counter left) {
        moduluss = modulus;
        leftt = left;
    }

    /**
     * @return the modulus
     */
    public int getModulus() {
        return moduluss;
    }
    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return leftt;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return digitt;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.digitt = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        counter += 1;
        digitt += 1;
        if (leftt == null) {
            if (digitt >= moduluss){
                counter =0;
            }
        }
        else if (digitt >= moduluss){
            digitt=0;
            leftt.digitt += 1;
        }



    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        return counter;
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
