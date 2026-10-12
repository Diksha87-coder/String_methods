import java.util.Scanner;
class TicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Are you a member? (true/false): ");
        boolean member = sc.nextBoolean();

        int price;

        if(age < 12)
            price = 5;
        else if(age >= 65)
            price = 7;
        else
            price = 10;

        if(member)
            price = price - 2;

        System.out.println("Ticket Price = $" + price);
        sc.close();
    }
}