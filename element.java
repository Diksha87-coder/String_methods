//WAP TO SEARCH AN ELEMENT FROM THE ARRAY
import java.util.Scanner;

public class element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];   // fixed size = 3

        System.out.println("Enter 3 elements:");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int elesearch = sc.nextInt();

        int f = 0;
        for (int i = 0; i < 3; i++) {
            if (arr[i] == elesearch) {
                f = 1;
                System.out.println("Element found at position " + (i + 1));
                break;
            }
        }

        if (f == 0) {
            System.out.println("Element not found");
            sc.close();
        }
    }
}