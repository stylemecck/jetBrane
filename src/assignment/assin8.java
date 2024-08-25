package assignment;

import java.util.Scanner;

public class assin8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String string1 = sc.nextLine();
        //create string builder
        StringBuilder reverdsed =  new StringBuilder(string1);
        //reversed string using reverse method
        reverdsed.reverse();
        //convert back to string
        String finalStr = reverdsed.toString();

        System.out.println("Reversed string: " +finalStr);
    }
}
