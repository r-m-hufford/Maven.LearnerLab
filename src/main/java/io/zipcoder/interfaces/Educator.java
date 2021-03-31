package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    YOUNGER(11L, "Younger",0.0),
    NOBLES(22L, "Nobles",0.0),
    DOLIO(33L,"Dolio",0.0);

    Instructor instructor;
    double timeWorked;

    private Educator (Long Id, String name, double timeWorked) {
        this.instructor = new Instructor(Id, name);
        this.timeWorked = timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);

    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    public Double getTimeWorked() {
        return this.timeWorked;
    }
}
