package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLectureTest() {
        ZipCodeWilmington zip = new ZipCodeWilmington();
        zip.hostLecture(130.0);
        zip.getStudyMap();
        System.out.println(zip.studyMap.values());

        //Assert.assertEquals(expected, actual);
    }

}
