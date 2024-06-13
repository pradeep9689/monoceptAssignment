package com.monocept.model;

import java.util.ArrayList;

public class ArrayListDemo {
    ArrayList<Person> personList= new ArrayList<Person>();

 
    public void addPerson(Person person) {
        personList.add(person);
    }

    public void addPersonAtBeginning(Person person) {
        personList.add(0, person);
    }

    public void addPersonAtEnd(Person person) {
        personList.add(person);
    }

    public void insertPersonAt(int index, Person person) {
        personList.add(index, person);
    }

    public Person getPersonAt(int index) {
        return personList.get(index);
    }

    public Person getFirstPerson() {
        return personList.get(0);
    }

    public Person getLastPerson() {
        return personList.get(personList.size() - 1);
    }

    public void updatePersonAt(int index, Person person) {
        personList.set(index, person);
    }

    public void removeFirstPerson() {
        if (!personList.isEmpty()) {
            personList.remove(0);
        }
    }

    public void removePersonAt(int index) {
        if (index < personList.size()) {
            personList.remove(index);
        }
    }

    public boolean containsPerson(Person person) {
        return personList.contains(person);
    }

    public int indexOfPerson(Person person) {
        return personList.indexOf(person);
    }

    public void clearList() {
        personList.clear();
    }

    public void printPersonList() {
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}

