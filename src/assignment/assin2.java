package assignment;

import java.util.Scanner;

public class assin2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first elements : ");
        double x = obj.nextDouble();
        System.out.println("Enter the Second elements : ");
        double y = obj.nextDouble();

        double product = x*y;
        System.out.println("The product of " +x+ " And " +y+ " is "+product);
    }
}
