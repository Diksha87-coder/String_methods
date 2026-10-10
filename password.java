import java.util.Scanner;

class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int password = 4545;

        System.out.print("Enter password: ");
        int p1 = sc.nextInt();

        if(p1 == password) {
            System.out.println("Access Granted");
        }
        else {
            System.out.print("Wrong! Enter password again: ");
            int p2 = sc.nextInt();

            if(p2 == password) {
                System.out.println("Access Granted");
            }
            else {
                System.out.print("Wrong! Enter password again: ");
                int p3 = sc.nextInt();

                if(p3 == password)
                    System.out.println("Access Granted");
                else
                    System.out.println("Access Denied - Account Locked");
                sc.close();
            }
        }
    }
}
