package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    Map<String,Double> studyMap = new HashMap<String, Double>();

    public ZipCodeWilmington(){

    }

/*    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.toArray(), numberOfHours);
    }*/

   public void hostLecture (long Id, Double numberOfHours) {
        instructors.findById(Id).lecture(students.toArray(), numberOfHours);
    }


    public Map<String, Double> getStudyMap() {
        for (Student student : students) {
            studyMap.put(student.getName(), student.getTotalStudyTime());
        }
            return studyMap;
    }
}
