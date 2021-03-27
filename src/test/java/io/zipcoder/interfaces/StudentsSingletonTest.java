package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class StudentsSingletonTest {

    @Test
    public void justin() {
        Students students = Students.getInstance();
        String actual  = students.findById(1L).getName();
        String expected = "Justin";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void monali() {
        Students students = Students.getInstance();
        String actual  = students.findById(2L).getName();
        String expected = "Monali";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void gerg() {
        Students students = Students.getInstance();
        String actual  = students.findById(3L).getName();
        String expected = "Gerg";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void xiong() {
        Students students = Students.getInstance();
        String actual  = students.findById(4L).getName();
        String expected = "Xiong";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void lena() {
        Students students = Students.getInstance();
        String actual  = students.findById(5L).getName();
        String expected = "Lena";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void abe() {
        Students students = Students.getInstance();
        String actual  = students.findById(6L).getName();
        String expected = "Abe";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void ashley() {
        Students students = Students.getInstance();
        String actual  = students.findById(7L).getName();
        String expected = "Ashley";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void chris() {
        Students students = Students.getInstance();
        String actual  = students.findById(8L).getName();
        String expected = "Chris";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void theresa() {
        Students students = Students.getInstance();
        String actual  = students.findById(9L).getName();
        String expected = "Theresa";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void hazel() {
        Students students = Students.getInstance();
        String actual  = students.findById(10L).getName();
        String expected = "Hazel";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void mike() {
        Students students = Students.getInstance();
        String actual  = students.findById(11L).getName();
        String expected = "Mike";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void kelly() {
        Students students = Students.getInstance();
        String actual  = students.findById(12L).getName();
        String expected = "Kelly";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void jorge() {
        Students students = Students.getInstance();
        String actual  = students.findById(13L).getName();
        String expected = "Jorge";

        Assert.assertEquals(expected, actual);

    }

}
