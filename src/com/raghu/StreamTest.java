package com.raghu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.*;

public class StreamTest {

    public static void main(String[] args) throws IOException {
        Person[] people = new Person[]{new Person("Raghu", "BGowda", 35), new Person("Sajan", "Kapur", 24),
                new Person("Amit", "Kumar", 67), new Person("Nitya", "Prabhu", 43), new Person("Raghu", "BGowda", 35)};

        List<Person> personsList = Arrays.asList(people);
        out.println(personsList.stream().filter(i -> i.age> 35).map( i -> i.age).count());
        List<Person> agedPersons = personsList.stream().filter(i -> i.age> 35).collect(Collectors.toList());
        out.println(personsList.stream().filter(p -> p.lName.startsWith("M")).collect(Collectors.toList()));
        agedPersons.forEach(out::println);

        OptionalInt maxIntOptional = IntStream.range(1,100).filter( x -> x%15 ==0).max();
        if(maxIntOptional.isPresent())
        out.println(maxIntOptional.getAsInt());

        Stream.of("Ryan", "Messy", "Jordan", "Adam", "Eveline", "Jack", "Mark").sorted().findFirst().ifPresent(out::println);

        Stream.of(1,2,3,4,5,6,7).mapToInt(x -> x*x).average().ifPresent(out::println);

        Stream.of("Ryan", "Messy", "Jordan", "Adam", "Eveline", "Jack", "Mark").map(s -> s.toLowerCase().concat(" ")).forEach(out::print);
        out.println();

        Stream<String> lines = Files.lines(Paths.get("/Users/raghu/IdeaProjects/sample-maven-project/src/com/raghu/data.txt"));
        out.println("Total sales: "+lines
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1])==1)
                .mapToDouble(x -> Double.parseDouble(x[2]))
                .reduce(0.0, (double a, double b) -> a+b));
        lines.close();

        IntSummaryStatistics stats = IntStream.of(1,4,6,8,3,12,76,23).summaryStatistics();
        out.println("IntSummaryStatistics: "+stats);
        out.println("Max is : "+stats.getMax());

        Arrays.stream(new String[]{"raghu", "maaya", "raghu"}).distinct().map(Person::new).forEach(out::println);

        Arrays.stream(people).distinct().forEach(out::println);
    }
}

class Person{
    int age;
    String fName;
    String lName;

    Person(final String fName, final String lName, final int age){
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    Person(final String fname){
        this.fName = fname;
    }

    public String toString(){
        return this.fName+" "+this.lName+" "+this.age;
    }

    @Override
    public boolean equals(Object other){
        Person that = (Person) other;
        if(this.fName == that.fName){
            if(this.lName == that.lName){
                return this.age == that.age;
            }
            return this.lName == that.lName;
        }

        return this.fName == that.fName;
    }

    @Override
    public int hashCode(){
        return (fName == null ? 0 : fName.hashCode()) ^ (lName == null ? 0 : lName.hashCode()) ^ age;
    }
}
