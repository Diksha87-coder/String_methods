import java.util.Scanner;

class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter string s1: ");
        String s1 = sc.nextLine();

        System.out.println("Character = " + s.charAt(2));
        System.out.println("Length = " + s.length());
        System.out.println("Substring = " + s.substring(2, 6));
        System.out.println("Uppercase = " + s.toUpperCase());
        System.out.println("Lowercase = " + s.toLowerCase());
        System.out.println("Concatenation = " + s.concat(s1));
        System.out.println("Equals = " + s.equals(s1));

        sc.close();
    }
}