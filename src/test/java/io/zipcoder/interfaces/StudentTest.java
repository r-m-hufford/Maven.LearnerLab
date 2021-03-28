package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testImplementation() {
        Student student = new Student(42L, "ted", 0.0);
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        Student student = new Student(42L, "ted",0.0);
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        Student student = new Student(42L, "ted", 0.0);
        student.learn(42.0);

        Double expected = 42.0;
        Double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

}
