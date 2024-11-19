package BeginnerLevel;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//      Scanner definition
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

//      take a num from user
        float num1 = input1.nextFloat();
        System.out.println(" enter the  first number: "+num1);
        float num2 = input2.nextFloat();
        System.out.println(" enter the  second number: "+num2);

//      definition user operation choice

        System.out.println("which operation you want to calculate?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice: ");
        int choice = input3.nextInt();

//

        switch (choice){
            case 1:
                System.out.println("Addition choose: "+(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction choose: "+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication choose: "+(num1*num2));
                break;
            case 4:
                System.out.println("Division choose: "+(num1/num2));
                break;
            default:
                System.out.println("Invalid choice");
                break;

        }

    }
}