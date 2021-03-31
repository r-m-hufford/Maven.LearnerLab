package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureTest() {
        ZipCodeWilmington zip = new ZipCodeWilmington();
        zip.hostLecture(130.0);

        Double expected = 20.0;
        Double actual = zip.students.findById(2L).getTotalStudyTime();

        Assert.assertEquals(expected, actual);
    }
}
