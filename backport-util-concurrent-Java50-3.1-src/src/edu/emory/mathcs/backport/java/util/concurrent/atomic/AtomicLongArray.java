/*
 * Written by Doug Lea with assistance from members of JCP JSR-166
 * Expert Group and released to the public domain, as explained at
 * http://creativecommons.org/licenses/publicdomain
 */

package edu.emory.mathcs.backport.java.util.concurrent.atomic;

/**
 * A {@code long} array in which elements may be updated atomically.
 * See the {@link edu.emory.mathcs.backport.java.util.concurrent.atomic} package specification
 * for description of the properties of atomic variables.
 * @since 1.5
 * @author Doug Lea
 */
public class AtomicLongArray extends java.util.concurrent.atomic.AtomicLongArray
                             implements java.io.Serializable {

    private static final long serialVersionUID = -2308431214976778248L;

    /**
     * Creates a new AtomicLongArray of given length.
     *
     * @param length the length of the array
     */
    public AtomicLongArray(int length) {
        super(length);
    }

    /**
     * Creates a new AtomicLongArray with the same length as, and
     * all elements copied from, the given array.
     *
     * @param array the array to copy elements from
     * @throws NullPointerException if array is null
     */
    public AtomicLongArray(long[] array) {
        super(array);
    }

    /**
     * Eventually sets the element at position {@code i} to the given value.
     *
     * @param i the index
     * @param newValue the new value
     * @since 1.6
     */
    public final void lazySet(int i, long newValue) {
        super.set(i, newValue);
    }
}
