/*
  File: ConditionVariable.java
  Originally written by Doug Lea and released into the public domain.
  This may be used for any purposes whatsoever without acknowledgment.
  Thanks for the assistance and support of Sun Microsystems Labs,
  and everyone contributing, testing, and using this code.
  History:
  Date       Who                What
  11Jun1998  dl               Create public version
 */

package edu.emory.mathcs.backport.java.util.concurrent.locks;

import java.util.Date;
import edu.emory.mathcs.backport.java.util.concurrent.*;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;


class ConditionObjectWrapper implements Condition, java.util.concurrent.locks.Condition,
                                        java.io.Serializable {

    /** The delegate **/
    protected final AbstractQueuedSynchronizer.ConditionObject condition;

    /**
     * Create a new CondVar that relies on the given mutual
     * exclusion lock.
     * @param lock A non-reentrant mutual exclusion lock.
     **/

    ConditionObjectWrapper(AbstractQueuedSynchronizer.ConditionObject condition) {
        this.condition = condition;
    }

    public void awaitUninterruptibly() {
        condition.awaitUninterruptibly();
    }

    public void await() throws InterruptedException {
        condition.await();
    }

    public boolean await(long timeout, TimeUnit unit) throws InterruptedException {
        return condition.await(unit.toNanos(timeout), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public boolean await(long timeout, java.util.concurrent.TimeUnit unit)
        throws InterruptedException
    {
        return condition.await(timeout, unit);
    }

    public long awaitNanos(long timeout) throws InterruptedException {
        return condition.awaitNanos(timeout);
    }

    public boolean awaitUntil(Date deadline) throws InterruptedException {
        return condition.awaitUntil(deadline);
    }

    public void signal() {
        condition.signal();
    }

    public void signalAll() {
        condition.signalAll();
    }
}
