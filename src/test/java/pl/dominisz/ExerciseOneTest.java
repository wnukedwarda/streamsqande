package pl.dominisz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * http://dominisz.pl
 * 03.04.2018
 */
public class ExerciseOneTest {

    @Test
    void testCreateMaleNameList7() {
        List<Person> roster = createRoster();
        List<String> result = ExerciseOne.createMaleNameList7(roster);
        assertEquals(2, result.size());
        assertEquals("Adam", result.get(0));
        assertEquals("Cezary", result.get(1));
    }

    @Test
    void testCreateMaleNameList8() {
        //analogicznie
        //lub wykorzystać dodatkową metodę z przekazaniem metody tworzącej imiona
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
