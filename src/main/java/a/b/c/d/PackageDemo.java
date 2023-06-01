package a.b.c.d;


import java.io.IOException;
import java.io.InputStream;

public class PackageDemo {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        String packageName = new PackageDemo().getClass().getPackageName();
        String className = new PackageDemo().getClass().getSimpleName();
        InputStream a = Class.forName("a.b.c.d.Person").getResourceAsStream("a.txt");
        System.out.println("Class: "+className+" is tn package: "+packageName);
        byte[] bytes = a.readAllBytes();
        System.out.println(new String(bytes));
    }
}
