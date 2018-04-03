package pl.dominisz;

import java.util.ArrayList;
import java.util.List;

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
        for (Person p : roster) {
            if (p.getGender() == Person.Sex.MALE) {
                System.out.println(p.getName());
            }
        }
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
