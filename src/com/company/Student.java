package com.company;

public class Student extends User implements Learnable {

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void todo() {
        System.out.println("Hello!");
    }

    @Override
    public void toLearn() {
        // to do
    }

    /*@Override
    public void toTravel() {
      // to do
    }*/
}