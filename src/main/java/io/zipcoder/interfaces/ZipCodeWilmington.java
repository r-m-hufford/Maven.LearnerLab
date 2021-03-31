package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Map;

public class ZipCodeWilmington {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    Map<Student,Double> studyMap = new HashMap<Student, Double>();

    public ZipCodeWilmington(){
        for (Student student : students) {
            studyMap.put(student, student.getTotalStudyTime());
        }
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        Educator.YOUNGER.lecture(students.toArray(), numberOfHours);
        for (Student student : students) {
            student.totalStudyTime += numberOfHours/students.size();
        }
    }

   public void hostLecture (Double numberOfHours) {
        Educator.YOUNGER.lecture(students.toArray(), numberOfHours);
        for (Student student : students) {
            student.totalStudyTime += numberOfHours/students.size();
        }
    }

    public Map<Student, Double> getStudyMap() {
        for (Student student : students) {
            studyMap.put(student, student.getTotalStudyTime());
        }
        return studyMap;
    }
}
