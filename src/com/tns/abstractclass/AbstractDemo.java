package com.tns.abstractclass;

public abstract class AbstractDemo {

    protected float area;
    abstract void calculate();

    void display() {
        System.out.println("Area of the given polynomial: " + area);
    }
}