package com.luxoft.java8.demo;

public class Person {
    private final Parent father;
    private final Parent mother;


    public Person(Parent father, Parent mother) {
        this.father = father;
        this.mother = mother;
    }

    public Parent getFather() {
        return father;
    }

    public Parent getMother() {
        return mother;
    }
}
