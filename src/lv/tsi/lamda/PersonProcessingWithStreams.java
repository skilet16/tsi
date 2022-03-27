package lv.tsi.lamda;

import java.util.ArrayList;
import java.util.List;

public class PersonProcessingWithStreams {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Max", 28));
        persons.add(new Person("Peter", 22));
        persons.add(new Person("Anna", 28));
        persons.add(new Person("Lilianna", 16));
        persons.add(new Person("Pamela", 13));
        persons.add(new Person("David", 22));

        PersonEvaluator personEvaluator = new PersonEvaluator(persons);

        personEvaluator.findPersonsByLetter("P");
        personEvaluator.findPersonsByOlderAgeThan(18);
        personEvaluator.groupByAge();
        personEvaluator.getAverageAge();
    }
}
