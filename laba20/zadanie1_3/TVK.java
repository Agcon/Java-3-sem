package ru.agcon.new_labs.laba20.zadanie1_3;

import java.io.Serializable;
import java.io.PrintStream;

public class TVK<T extends Comparable, V extends Serializable, K extends Animal> {
    private T tObject;
    private V vObject;
    private K kObject;

    public TVK(T tObject, V vObject, K kObject) {
        this.tObject = tObject;
        this.vObject = vObject;
        this.kObject = kObject;
    }

    public T getTObject() {
        return this.tObject;
    }

    public void setTObject(T tObject) {
        this.tObject = tObject;
    }

    public V getVObject() {
        return this.vObject;
    }

    public void setVObject(V vObject) {
        this.vObject = vObject;
    }

    public K getKObject() {
        return this.kObject;
    }

    public void setKObject(K kObject) {
        this.kObject = kObject;
    }

    public void showClassesName() {
        PrintStream var10000 = System.out;
        String var10001 = String.valueOf(this.tObject.getClass());
        var10000.println("T: " + var10001 + " V: " + String.valueOf(this.vObject.getClass()) + " K: " + String.valueOf(this.kObject.getClass()));
    }
}
