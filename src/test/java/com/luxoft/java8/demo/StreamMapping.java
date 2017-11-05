package com.luxoft.java8.demo;

import java.util.Arrays;
import java.util.List;

public class StreamMapping {
    public static void main(String[] args) {
        Parent father1 = new Parent(50);
        Parent mother1 = new Parent(40);
        Person person1 = new Person(father1, mother1);

        Parent father2 = new Parent(30);
        Parent mother2 = new Parent(40);
        Person person2 = new Person(father2, mother2);

        // present map
        List<Parent> parents = Arrays.asList(father1, father2, mother1, mother2);
        parents.stream()  // Stream<Parent>
                .map(parent -> parent.getAge())  // Stream<Integer> (ages)
                .forEach(System.out::println);

        // present flatMap
        List<Person> people = Arrays.asList(person1, person1);
        people.stream()  // Stream<Person>
                .map(person -> Arrays.asList(person.getMother(), person.getFather()))  // Stream<List<Parent>>
                // .map(list -> list.stream())  // Stream<Stream<Parent>>
                .flatMap(list -> list.stream())  // Stream<Parent>
                .forEach(System.out::println);
    }
}
