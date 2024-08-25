package assignment;

import java.util.Scanner;
public class assin9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        countCharacters(input);
    }

    public static void countCharacters(String str) {
        int letters = 0, space = 0, numbers = 0, others = 0;
        
        for (char ch: str.toCharArray()){
            if(Character.isLetter(ch)){
                letters++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else if (Character.isSpaceChar(ch)) {
                space++;
            }
            else {
                others++;
            }
        }

        System.out.println("Letters: " +letters);
        System.out.println("Spaces: " +space);
        System.out.println("Numbers: " +numbers);
        System.out.println("others characters: " +others);
    }

}
