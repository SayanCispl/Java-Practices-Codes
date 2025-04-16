package Map;

import java.util.Map;
import java.util.Scanner;

public class Test_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> ststusMap = Map.of(
                1, "Pending",
                2, "Approved",
                3, "Rejected"
        );
        System.out.print("Enter a status number (1, 2, or 3): ");
        int status= sc.nextInt();
        String message = ststusMap.getOrDefault(status, "Invalid status entered.");
        System.out.println("Status: " + message);
    }
}
