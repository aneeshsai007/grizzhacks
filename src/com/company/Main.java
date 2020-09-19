package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("What is your location?: Enter x-coordinates");
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        System.out.println("What is your location?: Enter y-coordinates");
        reader = new Scanner(System.in);
        int y = reader.nextInt();
        Location user = new Location(x,y);
        Town t = new Town();
        t.map();
    }
}
