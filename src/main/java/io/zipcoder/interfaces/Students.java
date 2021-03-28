package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Students extends People<Student> {

    private static final Students INSTANCE = new Students();
    private final List<Student> javaCohort;

    private Students() {
        this.javaCohort = new ArrayList<Student>();
        javaCohort.add(0, new Student(1L, "Justin", 0.0));
        javaCohort.add(1, new Student(2L, "Monali", 0.0));
        javaCohort.add(2, new Student(3L, "Gerg", 0.0));
        javaCohort.add(3, new Student(4L, "Xiong", 0.0));
        javaCohort.add(4, new Student(5L, "Lena", 0.0));
        javaCohort.add(5, new Student(6L, "Abe", 0.0));
        javaCohort.add(6, new Student(7L, "Ashley", 0.0));
        javaCohort.add(7, new Student(8L, "Chris", 0.0));
        javaCohort.add(8, new Student(9L, "Theresa", 0.0));
        javaCohort.add(9, new Student(10L, "Hazel", 0.0));
        javaCohort.add(10, new Student(11L, "Mike", 0.0));
        javaCohort.add(11, new Student(12L, "Kelly", 0.0));
        javaCohort.add(12, new Student(13L, "Jorge", 0.0));
    }

    public static Students getInstance() {
        return INSTANCE;
    }
    public Integer size() {
        return javaCohort.size();
    }

    public Student findById(Long Id) {
            for (Student student : javaCohort) {
                if(student.getID() == Id) {
                    return student;
                }
            }
            return null;
        }

    public Student[] toArray() {
        Student[] peopleToArray = new Student[people.size()];

        for (int i = 0; i < people.size(); i++) {
            peopleToArray[i] = people.get(i);
        }
        return peopleToArray;
    }
}
