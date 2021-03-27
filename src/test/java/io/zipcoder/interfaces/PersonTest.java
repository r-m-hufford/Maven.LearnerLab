package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void constructorIDTest() {
        Person person = new Person(42L, "BillnTed");

        Long expected = 42L;
        Long actual = person.getID();

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void constructorNameTest() {
        Person person = new Person(42L, "BillnTed");

        String expected = "BillnTed";
        String actual = person.getName();


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setNameTest() {
        Person person = new Person(42L, "BillnTed");
        person.setName("Justbill");

        String expected = "Justbill";
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

}
