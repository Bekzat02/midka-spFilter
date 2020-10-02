package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Circle c=new Circle(1,3.12, 6.24);
        Circle c1=new Circle(2,2.12, 4.24);
        Circle c2=new Circle(3,5.12, 10.24);
        Circle c3=new Circle(4,4.1, 8.2);
        Circle c4=new Circle(5,3.30, 6.60);

        List<Circle> circles=new ArrayList<>();
        circles.add(c);
        circles.add(c1);
        circles.add(c2);
        circles.add(c3);
        circles.add(c4);

        circles=new RadiusFilter().filter(circles);
        List<Circle> circles1=new RadiusFilter().filter(circles);
        System.out.println("choose the option 1) Radius 2)Diameter");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a==1) {
            for (Circle cs : circles) {
                System.out.println(", ID: " + cs.id + ", Radius: " + cs.radius);
            }
        }
        else if(a==2) {
            for (Circle cs : circles1) {
                System.out.println(", ID: " + cs.id + ", Diameter:  " + cs.diameter);
            }
        }
    }
}
