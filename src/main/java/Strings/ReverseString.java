package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String ");
        s = sc.nextLine();
        System.out.print("After reversing the string is: ");
        for (int i = s.length(); i > 0; i--) {
            System.out.print(s.charAt(i-1));

        }
    }
}
