package application;


import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;



public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();


        System.out.println(" Enter the measures of triangle: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();


        System.out.println(" Enter the measures of triangle: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
       
        double areax = x.area();

        double areay = y.area();

        System.out.printf(" O resultado de X é %.4f%n " ,x );
        System.out.printf(" O resultado de X é %.4f%n " ,y );




        sc.close();


        
        
    }
    
}
