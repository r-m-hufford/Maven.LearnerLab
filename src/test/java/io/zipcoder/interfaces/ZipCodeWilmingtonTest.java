package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureTest() {
        ZipCodeWilmington zip = new ZipCodeWilmington();
        Students students = Students.getInstance();
        zip.hostLecture(11L,130.0);

        Double expected = 10.0;
        Double actual = students.findById(1L).getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }

}
