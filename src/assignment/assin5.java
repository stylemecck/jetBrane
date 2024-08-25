package assignment;

import java.util.Scanner;

public class assin5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int deci = sc.nextInt();
        //convert decimal to octal number
        String octalNumber = Integer.toOctalString(deci);
        System.out.println("Octal: "+octalNumber);
    }
}
