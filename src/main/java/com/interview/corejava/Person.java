package com.interview.corejava;


public class Person {

    private String name;
    private int age;

    public Person(String name) {
        super();
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return "Bangalore";
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("Ravi", 20);
        System.out.printf(person.getName());
    }

}
