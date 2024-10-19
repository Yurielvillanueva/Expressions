import java.util.Scanner;

public class ImportandExport {
    public static void main(String[]yuri){
        Scanner sc = new Scanner(System.in);
        double num2 = 0;
        int num = 0;
        boolean flag = true;
        while(true){
            System.out.print("Enter Number: ");
            if(sc.hasNextDouble()){
                num += sc.nextDouble();
                num2++;
            }else {
                System.out.print("Invalid number...");
                break;
            }
            System.out.print("Do you want to enter another number? (Y/N): ");
            sc.nextLine();
            if(sc.nextLine().equalsIgnoreCase("N")){
                double ave = num / num2;
                System.out.printf("The average of the entered numbers is: " + ave);
                break;
            }
        }
    }
}


