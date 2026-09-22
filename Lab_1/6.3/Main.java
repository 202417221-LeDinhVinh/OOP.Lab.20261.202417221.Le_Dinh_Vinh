import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input n: ");
        String nStr = input.nextLine();
        int _n = Integer.parseInt(nStr);
        
        for (int i = 1; i <= _n; i++) {
            for (int j = 1; j <= _n - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        input.close();
    }
}