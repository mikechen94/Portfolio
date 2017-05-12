/**
 * Created by Eric's laptop on 16/01/2017.
 */

import java.lang.*;
import java.util.*;

public class ClassDemoGetInterface {

    public static void main(String[] args) {
        System.out.println("Please type in the name:");
        show(args[0]+".class");
    }

    public static void show(Class cls1) {
        System.out.println("Class = " + cls1.getName());

        Class[] c = cls1.getClasses();
        System.out.println("Classes = " + Arrays.asList(c));

        //Package[] p = cls1.getPackage();
        //System.out.println("Classes = " + Arrays.asList(c));

        // returns an array of interfaces
        Class[] i = cls1.getInterfaces();
        System.out.println("Interfaces = " + Arrays.asList(i));
    }
}