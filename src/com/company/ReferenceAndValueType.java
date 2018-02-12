package com.company;

public class ReferenceAndValueType {
    public static void main(String[] args) {
        //byte, int, long, short, double, float, char, boolean - primitive type (VALUE TYPE)

        int x = 5;
        addOneTo(x); // it's just passing addOneTo(5) because its value type (a box with pure value)
        int y = addOneTo(x);
        System.out.println(y);

        Person tom;
        tom = new Person("Tom"); // we create a new Person object, assign tom to refer to it
        tom.setAge(25);
        System.out.println(tom.getAge());
        celebrateBirtday(tom); // we passing that reference to a method, so the m() can use that reference to manipulate the object 
        System.out.println(tom.getAge());
    }
    // we manipulated a copy of the value passed
    public static int addOneTo(int number) {
        return  number = number + 1;
    }

    static void celebrateBirtday(Person person) {
        person.setAge(person.getAge() + 1);
    }


}
