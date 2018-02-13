package tutorials.tutorials.basic;

public class Person {

    String name; //instance variable
    int age;

    public Person(String name) {
        System.out.println("Person created");
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void sayHelloTo(Person person) {
        System.out.println(getName() + "said hello to " + person.getName());
    }
}
