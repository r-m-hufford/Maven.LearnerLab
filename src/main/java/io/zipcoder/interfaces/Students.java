package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Students extends People {

    private static final Students INSTANCE = new Students();
    private final List<Student> javaCohort;

    private Students() {
        this.javaCohort = new ArrayList<Student>();
        javaCohort.add(0, new Student(1L, "Justin"));
        javaCohort.add(1, new Student(2L, "Monali"));
        javaCohort.add(2, new Student(3L, "Gerg"));
        javaCohort.add(3, new Student(4L, "Xiong"));
        javaCohort.add(4, new Student(5L, "Lena"));
        javaCohort.add(5, new Student(6L, "Abe"));
        javaCohort.add(6, new Student(7L, "Ashley"));
        javaCohort.add(7, new Student(8L, "Chris"));
        javaCohort.add(8, new Student(9L, "Theresa"));
        javaCohort.add(9, new Student(10L, "Hazel"));
        javaCohort.add(10, new Student(11L, "Mike"));
        javaCohort.add(11, new Student(12L, "Kelly"));
        javaCohort.add(12, new Student(13L, "Jorge"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }
    public Integer size() {
        return javaCohort.size();
    }

    @Override
    public Person findById(Long Id) {
            for (Person person : javaCohort) {
                if(person.getID() == Id) {
                    return person;
                }
            }
            return null;
        }
}
