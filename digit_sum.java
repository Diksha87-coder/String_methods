
//SUM OF DIGITS
import java.util.Scanner;
class digit_sum {
    public static void main(String[] args) {
        int num,digit, sum;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number : ");
        num=sc.nextInt();

        sum=0;
        while(num>0){
            digit=num%10;
            sum=sum+digit;
            num=num /10;
        }
           System.out.print(" Sum of digits is = " + sum);
           sc.close();
    }
}

