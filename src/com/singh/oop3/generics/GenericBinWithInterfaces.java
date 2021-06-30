package com.singh.oop3.generics;

import com.singh.oop2.encapsulation.Insect;

public class GenericBinWithInterfaces<T extends Insect> {

    private T content;

    public GenericBinWithInterfaces(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        GenericBinWithInterfaces<Insect> test = new GenericBinWithInterfaces<>(new Insect(12));
        System.out.println(test.toString());
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
