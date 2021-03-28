package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Instructors extends People<Instructor> {
   private static final Instructors INSTANCE = new Instructors();
   private final List<Instructor> javaInstructors;

   private Instructors() {
       this.javaInstructors = new ArrayList<Instructor>();
       javaInstructors.add(0, Educator.YOUNGER.instructor);
       javaInstructors.add(1, Educator.NOBLES.instructor);
       javaInstructors.add(2, Educator.DOLIO.instructor);
   }

   public static Instructors getInstance() {
       return INSTANCE;
   }

   public Integer size() {
       return javaInstructors.size();
   }

    @Override
    public Instructor findById(Long Id) {
        for (Instructor instructor : javaInstructors) {
            if(instructor.getID() == Id) {
                return instructor;
            }
        }
        return null;
    }

}
