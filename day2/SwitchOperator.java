import java.util.Scanner;
class SwitchOperator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        System.out.print("Enter the operator('+','-','*','/','%'): ");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
                 System.out.println(a+b);
                 break;
            case '-':
                 System.out.println(a-b);
                 break;
            case '*':
                 System.out.println(a*b);
                 break;
            case '/':
                 System.out.println(a/b);
                 break;
            case '%':
                 System.out.println(a%b);
                 break;
                           
        }
    }
}