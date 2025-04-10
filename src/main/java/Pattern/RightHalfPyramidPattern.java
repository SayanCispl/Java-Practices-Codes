package Pattern;

public class RightHalfPyramidPattern {
    public static void main (String[]args){
        int i, j, row=6;
        // outer loop to handle rows
        for(i=1; i<= row; i++)
        {
            // inner loop to handle columns
            for (j=1; j<=i; j++){
                System.out.print("*");
            }
            // printing new line for each row
            System.out.println(" ");

        }
    }
}
