import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of elements: ");
        String nStr = input.nextLine();
        int _n = Integer.parseInt(nStr);

        int[] my_array1 = new int[_n];

        for (int i = 0; i < _n; i++) {
            System.out.print("Input element " + (i + 1) + ": ");
            String valStr = input.nextLine();
            my_array1[i] = Integer.parseInt(valStr);
        }

        System.out.println(Arrays.toString(my_array1));

        Arrays.sort(my_array1);

        System.out.println(Arrays.toString(my_array1));

        double _sum = 0;
        for (int i = 0; i < my_array1.length; i++) {
            _sum += my_array1[i];
        }

        double _average = _sum / my_array1.length;

        System.out.println("Sum: " + _sum);
        System.out.println("Average: " + _average);
        
        input.close();
    }
}