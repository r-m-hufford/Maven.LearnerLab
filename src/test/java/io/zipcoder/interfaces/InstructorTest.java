package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(42L, "instructor");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(42L, "instructor");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        Instructor instructor = new Instructor(42L, "teacher");
        Student student = new Student(99L, "cheddar");
        instructor.teach(student, 3);

        Double expected = 3.0;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testLecture() {
        Instructor instructor = new Instructor(42L, "teacher");
        Student[] students = new Student[]{
            new Student(1L, "cheddar"),
            new Student(2L, "tony"),
            new Student(3L, "basketball"),
            new Student(4L, "gaddis")};

        instructor.lecture(students, 12);

        Double expected = 3.0;
        Double actual = students[2].getTotalStudyTime();

        Assert.assertEquals(expected,actual);
    }
}