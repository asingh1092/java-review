package com.singh.oop2.interfaces;

public interface MascotInterfaceExample {
    // any variables declared in interfaces are public, static, and final by default
    public static final double MAX_CELEBRATION_SEC = 30;

    // methods are public, and abstract by default
    public void celebrate();
    public void whine();
    public void chant();
    public void run();
}
