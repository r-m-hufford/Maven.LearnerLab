package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    Double totalStudyTime = 0.0;


    public Student(Long ID, String name, Double totalStudyTime) {
        super(ID, name);
        this.totalStudyTime = totalStudyTime;
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

}
