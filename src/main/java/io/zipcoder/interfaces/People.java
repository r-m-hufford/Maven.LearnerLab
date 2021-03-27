package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class People implements Iterable<Person>{
    List<Person> people = new ArrayList<Person>();

    public void add (Person person) {
        people.add(person);
    }

    public Person findById(Long Id) {
        for (Person person : people) {
            if(person.getID() == Id) {
                return person;
            }
        }
        return null;
    }

    public Integer count() {
        return people.size();
    }

    public Boolean contains (Person person) {
        if (people.contains(person)) {
            return true;
        }
        return false;
    }

    public void remove(Person person) {
        if (contains(person)) {
            people.remove(person);
        }
    }

    public void removeAll () {
        people.removeAll(people);
    }

    public Person[] toArray() {
        Person[] peopleToArray = new Person[people.size()];

        for (int i = 0; i < people.size(); i++) {
            peopleToArray[i] = people.get(i);
        }
        return peopleToArray;
    }

    public Iterator<Person> iterator() {
        return people.iterator();
    }
}
