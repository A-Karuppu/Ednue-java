import java.util.Scanner;
class Condition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int a=sc.nextInt();
        if(a<18){
            System.out.println("not eligable to vote");
        }
        else if(a>18){
            System.out.println("eligable to vote");
        }
        else{
            System.out.println("enter the age:");
        }
    }
}
