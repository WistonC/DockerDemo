package a.b.c.d;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class Person implements Human{
    private int id;
    private String name;
    private String gender;

    public Person() {
    }

    public Person(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "a.b.c.d.Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }
}

