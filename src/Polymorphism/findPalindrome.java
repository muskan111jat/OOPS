package Polymorphism;
import java.util.Scanner;
public class findPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;
        while (num != 0) {
            int dig = num % 10;
            reversed = reversed * 10 + dig;
            num = num / 10;

        }
        if (reversed == original) {
            System.out.println("it is a palindrome number" );
        } else {
            System.out.println("it is not a palindrome number" );
        }

    }
}

