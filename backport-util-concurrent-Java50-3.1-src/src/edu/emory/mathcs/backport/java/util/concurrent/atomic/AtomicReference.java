/*
 * Written by Doug Lea with assistance from members of JCP JSR-166
 * Expert Group and released to the public domain, as explained at
 * http://creativecommons.org/licenses/publicdomain
 */

package edu.emory.mathcs.backport.java.util.concurrent.atomic;

/**
 * An object reference that may be updated atomically. See the {@link
 * edu.emory.mathcs.backport.java.util.concurrent.atomic} package specification for description
 * of the properties of atomic variables.
 * @since 1.5
 * @author Doug Lea
 */
public class AtomicReference extends java.util.concurrent.atomic.AtomicReference
                             implements java.io.Serializable {

    private static final long serialVersionUID = -1848883965231344442L;

    /**
     * Creates a new AtomicReference with the given initial value.
     *
     * @param initialValue the initial value
     */
    public AtomicReference(Object initialValue) {
        super(initialValue);
    }

    /**
     * Creates a new AtomicReference with null initial value.
     */
    public AtomicReference() {
        super();
    }

    /**
     * Eventually sets to the given value.
     *
     * @param newValue the new value
     * @since 1.6
     */
    public final void lazySet(Object newValue) {
        super.set(newValue);
    }
}
