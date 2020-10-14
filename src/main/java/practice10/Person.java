package practice10;

import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.",
                name, age);
    }

    @Override
    public boolean equals(Object myObj){
        if (this == myObj) return true;
        if (myObj == null || getClass() != myObj.getClass()) return false;
        Person person = (Person) myObj;
        return age == person.age && id == person.id && Objects.equals(name, person.name);
    }
}
