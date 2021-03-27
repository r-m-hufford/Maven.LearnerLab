package io.zipcoder.interfaces;

import java.util.Random;

public class Person {
    Random random = new Random();
    private final Long ID;
    private String name;

    public Person(Long ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public Long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
