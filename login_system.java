//login system

 import java.util.Scanner;
 class login_system{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int password = 4545;
        int attempts=0;
        while(attempts<3){
            System.out.print("enter password : ");
            int input = sc.nextInt();

            if (input == password){
                System.out.println("access granted ");
            }
            else{System.out.println("incorrect password");}

            attempts++;
        }
       System.out.print("logged out");
       sc.close();
    }
 }