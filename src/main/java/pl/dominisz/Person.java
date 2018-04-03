package pl.dominisz;

/**
 * http://dominisz.pl
 * 03.04.2018
 */
public class Person {

    public enum Sex {
        MALE,
        FEMALE
    }

    private Sex gender;
    private String name;

    public Person(Sex gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    public Sex getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
