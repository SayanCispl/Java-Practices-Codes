package Conditions;

import java.util.Scanner;

public class Test_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Hi");
            break;
            case 3 : System.out.println("Test");
            break;
            default :  System.out.println("Invalid");
        }
    }
}
