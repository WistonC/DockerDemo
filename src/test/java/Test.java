import java.io.File;
import java.io.Serializable;
import java.util.*;

public class Test {
    @org.junit.Test
    public void test(){
        String a = "Daniel K. Inouye International Airport";
        System.out.println(a.length());
    }

    @org.junit.Test
    public void test2(){
        File file = new File("./src/main/java/a.txt");
/*        String[] list = file.list();
        System.out.println(list[0]);*/
        long l = file.lastModified();
        Date date = new Date(l);
        System.out.println(date);
    }

    @org.junit.Test
    public void test3(){
        Map<Long, String> hashMap = new HashMap<>();
        hashMap.put(2L, "Test1");
        hashMap.put(1L, "Test2");
        hashMap.put(5L, "Test3");
        hashMap.put(3L, "Test4");
        hashMap.put(4L, "Test5");
        Set<Long> treeSet = new TreeSet<>((o1, o2) -> Long.compare(o2, o1));
        treeSet.addAll(hashMap.keySet());
        for (Long s : treeSet) {
            String s1 = hashMap.get(s);
            System.out.print(s);
            System.out.println(s1);
            System.out.println("Correct commit");

        }
    }
}
