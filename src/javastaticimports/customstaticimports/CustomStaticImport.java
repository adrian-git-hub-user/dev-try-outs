package javastaticimports.customstaticimports;

import static java.lang.Math.*;
import static java.lang.System.out;

import java.io.PrintStream;

public class CustomStaticImport {
    public static void main(String[] args) {
    	
    	PrintStream p = java.lang.System.out;
        p.println("Hello World!");
        p.println("Considering a circle with a diameter of 5 cm, it has:");
        out.println("A circumference of " + (PI * 5) + " cm");
        out.println("And an area of " + (PI * pow(2.5,2)) + " sq. cm");
    }
}
