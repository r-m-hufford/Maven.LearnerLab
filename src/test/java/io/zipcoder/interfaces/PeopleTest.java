package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class PeopleTest {

    @Test
    public void addTest() {
        People people = new People();
        Person person = new Person(42L, "gnat");

        people.add(person);

        Integer actual = people.count();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findById() {
        People people = new People();
        Person person1 = new Person(1L, "person1");
        Person person2 = new Person(2L, "person2");
        Person person3 = new Person(3L, "person3");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        Person person = people.findById(3L);

        Assert.assertEquals(person, person3);
    }

    @Test
    public void contains() {
        People people = new People();
        Person person1 = new Person(1L, "person1");
        Person person2 = new Person(2L, "person2");
        Person person3 = new Person(3L, "person3");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        Assert.assertTrue(people.contains(person1));
    }

    @Test
    public void remove() {
        People people = new People();
        Person person1 = new Person(1L, "person1");
        Person person2 = new Person(2L, "person2");
        Person person3 = new Person(3L, "person3");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        people.remove(person3);

        Assert.assertFalse(people.contains(person3));
    }

    @Test
    public void removeAll() {
        People people = new People();
        Person person1 = new Person(1L, "person1");
        Person person2 = new Person(2L, "person2");
        Person person3 = new Person(3L, "person3");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        people.removeAll();

        Assert.assertTrue(people.count() == 0);
    }

    @Test
    public void toArray() {
        People people = new People();
        Person person1 = new Person(1L, "person1");
        Person person2 = new Person(2L, "person2");
        Person person3 = new Person(3L, "person3");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println(people.toArray());
        }

    @Test
    public void iterator() {
        People people = new People();
        Person person1 = new Person(1L, "person1");
        Person person2 = new Person(2L, "person2");
        Person person3 = new Person(3L, "person3");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        Iterator iterator = people.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
