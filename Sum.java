import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a ,b, c ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Digit :");
        a = sc.nextInt();
        System.out.println("Enter Second Digit :");
        b = sc.nextInt();

        c = a + b;

        System.out.printf("Sum of two digit is %d " , c);
    }
}
