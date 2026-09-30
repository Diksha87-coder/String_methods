//WAP TO FIND OUT GREATEST AND SMALLEST ELEMENT FROM THE ARRAY
import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        
        System.out.println("Enter 3 elements:");
        for (int i = 0; i <= 2; i++) {
            arr[i] = sc.nextInt();}
     
        int greatest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i <= 2; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        
        System.out.println("Greatest element: " + greatest);
        System.out.println("Smallest element: " + smallest);
        sc.close();
    }
}