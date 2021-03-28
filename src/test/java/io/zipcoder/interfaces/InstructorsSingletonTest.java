package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsSingletonTest {
    @Test
    public void younger() {
        Instructors instructors = Instructors.getInstance();
        String actual  = instructors.findById(11L).getName();
        String expected = "Younger";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void nobles() {
        Instructors instructors = Instructors.getInstance();
        String actual  = instructors.findById(22L).getName();
        String expected = "Nobles";

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void dolio() {
        Instructors instructors = Instructors.getInstance();
        String actual  = instructors.findById(33L).getName();
        String expected = "Dolio";

        Assert.assertEquals(expected, actual);

    }

}
