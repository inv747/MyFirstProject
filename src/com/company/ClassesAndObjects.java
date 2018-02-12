package com.company;

public class ClassesAndObjects {
    public static void main(String[] args) {

        Person john = new Person("John");
        Person bob = new Person("Bob");
        john.setAge(20);
        bob.setAge(25);
        john.sayHelloTo(bob);
        System.out.println(john.getName() + " is " + john.getAge() + " year old");
        System.out.println(bob.getName() + " is " + bob.getAge() + " year old");

    }
}
