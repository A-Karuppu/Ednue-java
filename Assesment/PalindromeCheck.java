import java.util.Scanner;

public class PalindromeCheck {
    static int palin(int n) {
        int reversed = 0, original = n;
        while (n > 0) {
            reversed = (reversed * 10) + n % 10;
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number");
        int n = sc.nextInt();
        int reversedNumber = palin(n); 

        if (n == reversedNumber) {
            System.out.println(n + " is a Palindrome");
        } else {
            System.out.println(n + " is not a Palindrome");
        }

        sc.close(); 
    }
}
