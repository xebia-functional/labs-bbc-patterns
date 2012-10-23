package com.fortysevendeg.bbc.patterns.factorymethod;

/**
 * A demonstration of a factory method
 */
public class PersonImpl implements Person {

    private String name;

    private int age;

    private PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Person personWithNameAndAge(String name, int age) {
        return new PersonImpl(name, age);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
