import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first number: ");
        String strNum1 = input.nextLine();
        double num1 = Double.parseDouble(strNum1);

        System.out.print("Input second number: ");
        String strNum2 = input.nextLine();
        double num2 = Double.parseDouble(strNum2);

        System.out.println("Input 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division:");
        int choice = Integer.parseInt(input.nextLine());

        double res = 0;
        boolean isValid = true;

        switch(choice) {
            case 1: 
                res = num1 + num2; 
                break;
            case 2: 
                res = num1 - num2; 
                break;
            case 3: 
                res = num1 * num2; 
                break;
            case 4: 
                if(num2 == 0) { 
                    System.out.println("Error, divisor cannot be zero");
                    isValid = false;
                } else {
                    res = num1 / num2; 
                }
                break;
            default:
                System.out.println("Error, invalid operation choice");
                isValid = false;
        }

        if (isValid) {
            System.out.println("Result: " + res);
        }

        input.close();
    }
}