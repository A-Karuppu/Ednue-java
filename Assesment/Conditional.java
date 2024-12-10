import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        if(num==0){
            System.out.println("The Number is Zero");
        }
        else if(num>0){
            System.out.println("The Number is positive");
        }
        else{
            System.out.println("The Number is Negative");
        }
    }
}
