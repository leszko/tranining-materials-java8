package com.luxoft.java8.module2.stream.exercise6;

import com.luxoft.java8.module2.stream.exercise6.model.Person;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1) Create a map which prints amount of person of each age use com.luxoft.java8.stream.collect(Collectors.groupingBy(Function,
 * Collectors.mapping(Function, Collectors.counting())))
 *
 * 2) Create a map Gender->String with gender as keys and comma-separated names as values use
 * com.luxoft.java8.stream.collect(Collectors.groupingBy(Function, Collectors.mapping(Function,
 * Collectors.joining(","))))
 *
 * 3) Calculate and print the average age of females use com.luxoft.java8.stream.filter(Predicate).mapToInt(Function).average()
 *
 * 4) Create a map with genders as keys and average ages as values use
 * com.luxoft.java8.stream.collect(Collectors.groupingBy(Function, Collectors.averagingInt(Function))
 *
 * 5) Print the list of persons in alphabetical order of names use com.luxoft.java8.stream.sorted(Comparator.comparing(Function))
 *
 * 6) Print the list of persons in order of gender, then name: use com.luxoft.java8.stream.sorted(Comparator.comparing(Function).thenComparing(Function)
 */
public class CollectorsTutor {

  public static void main(String... args) {

    List<Person> persons = new ArrayList<>();

    try (
        BufferedReader reader =
            new BufferedReader(
                new InputStreamReader(
                    CollectorsTutor.class.getClassLoader().getResourceAsStream("people.txt")));

        Stream<String> stream = reader.lines();
    ) {

      stream.map(line -> {
        String[] s = line.split(" ");
        Person p = new Person(s[0].trim(), Integer.parseInt(s[1]), s[2].trim());
        persons.add(p);
        return p;
      })
          .forEach(System.out::println);


    } catch (IOException ioe) {
      System.out.println(ioe);
    }

    // 1) Create a map which prints amount of person of each age
    //  use com.luxoft.java8.stream.collect(Collectors.groupingBy(Function, Collectors.mapping(Function, Collectors.counting())))

    // 2) Create a map Gender->String with gender as keys and comma-separated names as values
    // 	use com.luxoft.java8.stream.collect(Collectors.groupingBy(Function, Collectors.mapping(Function, Collectors.joining(","))))

    // 3) Calculate and print the average age of females
    // 	use com.luxoft.java8.stream.filter(Predicate).mapToInt(Function).average()

    // 4) Create a map with genders as keys and average ages as values
    // 	use com.luxoft.java8.stream.collect(Collectors.groupingBy(Function, Collectors.averagingInt(Function))

    // 5) Print the list of persons in alphabetical order of names
    // 	use com.luxoft.java8.stream.sorted(Comparator.comparing(Function))

    // 6) Print the list of persons in order of gender, then name:
    // 	use com.luxoft.java8.stream.sorted(Comparator.comparing(Function).thenComparing(Function)

  }
}
