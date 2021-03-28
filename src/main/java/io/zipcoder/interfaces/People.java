package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class People<E extends Person> implements Iterable<E>{
    List<E> people = new ArrayList<E>();

    public void add (E person) {
        people.add(person);
    }

    public E findById(Long Id) {
        for (E person : people) {
            if(person.getID() == Id) {
                return person;
            }
        }
        return null;
    }

    public Integer count() {
        return people.size();
    }

    public Boolean contains (E person) {
        if (people.contains(person)) {
            return true;
        }
        return false;
    }

    public void remove(E person) {
        if (contains(person)) {
            people.remove(person);
        }
    }

    public void removeAll () {
        people.removeAll(people);
    }


    public Iterator<E> iterator() {
        return people.iterator();
    }
}
