package com.singh.oop3.generics;

import com.singh.oop2.inheritance.Car;

public class GenericBin<T> {

    private T content;

    public GenericBin(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        GenericBin<String> test = new GenericBin<>("I'm a basic String");
        test.setContent("short and stout");
        test.setContent("eleemnt is my handle");
        test.setContent("getContent is my spout");
        GenericBin<Car> test2 = new GenericBin<Car>(new Car("Yuhina", "Spark", 2037));
        test2.setContent(new Car("AnotherYuhina", "Spark2", 2050));
        System.out.println(test2.toString());
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
