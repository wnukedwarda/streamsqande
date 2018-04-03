package pl.dominisz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise from
 * https://docs.oracle.com/javase/tutorial/collections/streams/QandE/questions.html
 *
 * Write the following enhanced for statement as a pipeline with lambda expressions.
 * Hint: Use the filter intermediate operation and the forEach terminal operation.
 */
public class ExerciseOne {

    public static void main(String[] args) {
        List<Person> roster = createRoster();
        //wywołania poniższych metod
    }

    public static List<String> createMaleNameList7(List<Person> roster) {
        List<String> maleNames = new ArrayList<>();
        for (Person p : roster) {
            if (p.getGender() == Person.Sex.MALE) {
                maleNames.add(p.getName());
            }
        }
        return maleNames;
    }

    public static List<String> createMaleNameList8(List<Person> roster) {
        return roster.stream()
                .filter(person -> person.getGender() == Person.Sex.MALE)
                .map(person -> person.getName())
                .collect(Collectors.toList());
    }

    private static List<Person> createRoster() {
        List<Person> roster = new ArrayList<>();
        roster.add(new Person(Person.Sex.MALE, "Adam"));
        roster.add(new Person(Person.Sex.FEMALE, "Beata"));
        roster.add(new Person(Person.Sex.MALE, "Cezary"));
        roster.add(new Person(Person.Sex.FEMALE, "Danuta"));
        return roster;
    }
}
