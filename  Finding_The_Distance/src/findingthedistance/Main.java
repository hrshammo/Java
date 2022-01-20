package findingthedistance;
import java.util.Scanner;
import java.lang.Math;
// Find the distance between the points. Here point 1(x1,y1), point 2(x2,y2).
//Jan 20, 2021
//All Copyright © goes to Hamim Reza Shammo (https://github.com/hrshammo/)
public class Main {

    public static void main(String[] args) {

        double x1,y1,x2,y2,distance,x,y;
        Scanner input= new Scanner(System.in);

        System.out.println("ENTER x1 and y1 : ");
        x1= input.nextDouble();
        y1= input.nextDouble();

        System.out.println("ENTER x2 and y2 : ");
        x2= input.nextDouble();
        y2= input.nextDouble();
        /*
            distance between two points by using the distance
            formula = d=√((x_2-x_1)²+(y_2-y_1)²)
        */
        x=x2-x1;
        y=y2-y1;
        distance=Math.sqrt((Math.pow(x,2)+Math.pow(y,2)));
        System.out.println("THE DISTANCE WILL BE " +distance);
    }
}
