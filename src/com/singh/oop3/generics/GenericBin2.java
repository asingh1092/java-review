package com.singh.oop3.generics;

import com.singh.oop2.inheritance.Car;

public class GenericBin2<X, Y> {

    private X content1;
    private Y content2;

    public GenericBin2(X content1, Y content2) {
        this.content1 = content1;
        this.content2 = content2;
    }

    public static void main(String[] args) {
        GenericBin2<String, String> test = new GenericBin2<>("I'm a basic String", "I'm another basic string!");
        GenericBin2<Car, String> test2 =
                new GenericBin2<>(new Car("Make", "Model", 1), "I'm the second bin!");
    }

    public X getContent1() {
        return content1;
    }

    public void setContent1(X content1) {
        this.content1 = content1;
    }

    public Y getContent2() {
        return content2;
    }

    public void setContent2(Y content2) {
        this.content2 = content2;
    }
}
