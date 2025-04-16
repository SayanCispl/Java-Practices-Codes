package Strings;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] months = {
                "Invalid", // index 0 is unused
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };

        System.out.print("Enter the number of the month (1-12): ");
        int monthNumber = sc.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Month: " + months[monthNumber]);
        } else {
            System.out.println("Invalid month number.");
        }

        sc.close();
    }
}
