/*
 * Written by Doug Lea with assistance from members of JCP JSR-166
 * Expert Group and released to the public domain, as explained at
 * http://creativecommons.org/licenses/publicdomain
 */

package edu.emory.mathcs.backport.java.util.concurrent.atomic;

/**
 * An array of object references in which elements may be updated
 * atomically.  See the {@link edu.emory.mathcs.backport.java.util.concurrent.atomic} package
 * specification for description of the properties of atomic
 * variables.
 * @since 1.5
 * @author Doug Lea
 */
public class AtomicReferenceArray extends java.util.concurrent.atomic.AtomicReferenceArray
                                  implements java.io.Serializable {

    private static final long serialVersionUID = -6209656149925076980L;

    /**
     * Creates a new AtomicReferenceArray of given length.
     * @param length the length of the array
     */
    public AtomicReferenceArray(int length) {
        super(length);
    }

    /**
     * Creates a new AtomicReferenceArray with the same length as, and
     * all elements copied from, the given array.
     *
     * @param array the array to copy elements from
     * @throws NullPointerException if array is null
     */
    public AtomicReferenceArray(Object[] array) {
        super(array);
    }

    /**
     * Eventually sets the element at position {@code i} to the given value.
     *
     * @param i the index
     * @param newValue the new value
     * @since 1.6
     */
    public final void lazySet(int i, Object newValue) {
        super.set(i, newValue);
    }
}
