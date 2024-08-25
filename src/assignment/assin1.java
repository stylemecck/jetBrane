package assignment;

import java.util.Scanner;

class cal{
    double z;
    void add(double x, double y){
        z=x+y;
        System.out.println( x+ " + " +y+ " = "+z);
    }
    void multi (double x, double y){
        z = x*y;
        System.out.println( x+ " * " +y+ " = "+z);
    }
    void subs(double x, double y){
        z = x-y;
        System.out.println( x+ " - " +y+ " = "+z);
    }
    void div (double x, double y){
        z = x/y;
        System.out.println( x+ " / " +y+ " = "+z);
    }
    void reminder (double x, double y){
        z =x%y;
        System.out.println( x+ " remender of  " +y+ " = "+z);
    }
}

public class assin1 {
    public static void main(String[] args) {
        double x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first element ");
        x=sc.nextDouble();
        System.out.println("Enter the second element ");
        y=sc.nextDouble();
        //class call method
        cal callFunc = new cal();
        callFunc.add(x,y);
        callFunc.multi(x,y);
        callFunc.subs(x,y);
        callFunc.div(x,y);
        callFunc.reminder(x,y);
    }
}
