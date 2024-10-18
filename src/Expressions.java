import java.util.Scanner;

public class Expressions {
    public static void main(String[]yuri){
        Scanner sc = new Scanner(System.in);
        double num2 = .2;
        int num = 0;
        double ans = 0;
        boolean flag = true;
        while(true){
            System.out.print("Enter Number: ");
            if(sc.hasNextDouble()){
                num2 += sc.nextDouble();
                ans++;
            }else {
                System.out.print("Invalid number...");
                sc.next();
                continue;
            }
            System.out.print("Do you want to enter another number? (Y/N): ");
            sc.nextLine();
            if(sc.nextLine().equalsIgnoreCase("N")){
                System.out.print("The average of the entered numbers is: " + num2);
                break;
            }
        }
    }
}



