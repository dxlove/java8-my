package com.dx.java8.day7;

public abstract class ProcessingObjet<T> {
    protected ProcessingObjet<T> successor;

    public void setSuccessor(ProcessingObjet<T> successor) {
        this.successor = successor;
    }

    public T handle(T input) {
        T r = handleWork(input);
        if (successor != null) {
            return successor.handle(r);
        }
        return r;
    }

    abstract protected T handleWork(T input);
}
