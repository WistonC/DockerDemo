package a.b.c.d;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class Walk {
    private int dist;
    private String from;
    private String dest;
    private Person p;
    public Walk(){
        System.out.println("Creating Walk");
        GW.getGW();
    }
    public void walk(){
        System.out.println("Walking");
    }

}

