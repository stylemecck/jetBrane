package assignment;

import java.util.Scanner;

public class assin4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first elements : ");
        String binary1 = sc.nextLine();
        System.out.println("Enter the Second elements : ");
        String binary2 = sc.nextLine();
        //converts binary to integers
        int num1 = Integer.parseInt(binary1,2);
        int num2 = Integer.parseInt(binary2,2);
        //multiply the number
        int product = num1*num2;
        String binaryProduct = Integer.toBinaryString(product);
        //output
        System.out.println("Product of two binary number is "+binaryProduct);
        System.out.println("product of the number in decimal " +product);

    }
}
