package a.b.c.d;

import a.b.c.d.Person;

public class Student extends Person {
/*    private int id;
    private String name;
    private String gender;*/
    private String dept;

    // a.b.c.d.Person student = new a.b.c.d.Person();

    public Student(int id, String name, String gender) {
        /*student.setId(id);
        student.setName(name);
        student.setGender(gender);*/
        this.setId(id);
        this.setName(name);
        this.setGender(gender);
    }

 /*   public int getId() {
        return super.getId();
    }

    public void setId(int id) {
        super.setId(id);
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public String getGender() {
        return super.getGender();
    }

    public void setGender(String gender) {
        super.setGender(gender);
    }*/

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    /*@Override
    public String toString() {
        return "a.b.c.d.Student{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", gender='" + this.getGender() + '\'' +
                '}';
    }*/
}
