package Conditions;

import java.util.Scanner;

public class Test_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Button = sc.nextInt();
        if (Button ==1){
            System.out.println("Hello");
        }
        else if (Button == 2){
            System.out.println("Holla");
        }
        else if (Button == 3){
            System.out.println("Bonjour");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
