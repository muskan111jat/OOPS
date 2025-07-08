package Polymorphism;

import java.util.Scanner;

public class PracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reversed = 0;
        while (num != 0) {
            int dig = num % 10;
            reversed = reversed * 10 + dig;
            num = num / 10;
        }
        System.out.println(reversed);
    }
}

