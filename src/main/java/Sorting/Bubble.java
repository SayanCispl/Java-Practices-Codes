package Sorting;

public class Bubble {
    public static void main (String[] args){
        int arr[] = {9,10,1,2,5};
        int n = arr.length;
        // bubble Shot
        for(int i=0; i< n-1 ; i++){

            for (int j=0; j<n-i-1; j++){

                if(arr[j]> arr[j+1]){
                    // Swap arr[j] and arr[j+1] without using a function
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // Print the sorted array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
