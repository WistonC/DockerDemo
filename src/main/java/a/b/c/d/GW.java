package a.b.c.d;

public class GW {
    private GW(){
        System.out.println("creating GW");
    }
    private static void createGW(){
        GW g = new GW();
        System.out.println("calling createGW()");
        readDB();
    }
    private static void readDB(){
        System.out.println("Reading DB");
    }
    public static void getGW(){
        System.out.println("Getting GW");
        createGW();
        readDB();
    }

}
