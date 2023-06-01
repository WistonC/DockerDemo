package a.b.c.d;

public class Bird {
    private String name = "Bird";
    private int age = 10;

    public String getName() {
        System.out.println("getting name");
        return name;
    }

    public void setName() {
        this.name = name;
        System.out.println("setting name");
    }

    public int getAge() {
        System.out.println("getting age");
        return age;
    }

    public void setAge() {
        System.out.println("setting age");
        this.age = age;
    }
}
