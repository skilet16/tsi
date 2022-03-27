package lv.tsi.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonEvaluator {
    List<Person> persons = new ArrayList<>();

    public PersonEvaluator(List<Person> persons) {
        this.persons = persons;
    }
    void findPersonsByLetter(String letter){
        System.out.println("Persons with letter " + letter + " :");
        persons.stream()
                .filter(person -> person.name.substring(0,1).matches(letter))
                .forEach(System.out::println);
    }

    void findPersonsByOlderAgeThan(int age){
        System.out.println("Persons are older than "+ age +":");
        persons.stream()
                .filter(person -> person.age > age)
                .forEach(System.out::println);
    }

    void groupByAge(){
        var result =  persons.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(result);
    }

    void getAverageAge(){
        persons.stream()
                .mapToDouble(persons -> persons.age)
                .average()
                .ifPresent(avg -> System.out.println("Average age is : " + avg));
    }
}
