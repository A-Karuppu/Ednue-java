import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1,2,3,4,5,6,7 ") ;
        System.out.println("Enter thea Number:");
        int Days=sc.nextInt();
        switch(Days){
            case 1:
            System.out.println("Monday WeekDay");
            break;
            case 2:
            System.out.println("Tueshday WeekDay");
            break;
            case 3:
            System.out.println("Wedneshday WeekDay");
            break;
            case 4:
            System.out.println("Thurshday WeekDay");
            break;
            case 5:
            System.out.println("Friday WeekDay");
            break;
            case 6 :
            System.out.println("saturday WeekEnd");
            break;
            case 7:
            System.out.println("Sunday WeekEnd");
            break;
        }
    }
}
