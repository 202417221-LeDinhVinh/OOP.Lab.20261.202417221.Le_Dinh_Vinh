import java.util.*;

public class Main {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("Input first number: ");
   String num1 = input.nextLine();
   double _num1 = Double.parseDouble(num1);

   System.out.print("Input second number: ");
   String num2 = input.nextLine();
   double _num2 = Double.parseDouble(num2);

   System.out.print("Input 1 for addition,\n 2 for Difference, \n 3 for multiplication \n 4 for division");
   double res = 0;
   int n = Integer.parseInt(input.nextLine());

   boolean flag = true;

   switch(n){
    case 1: {  res = _num1 + _num2; break; }
    case 2: {  res = _num1 - _num2; break; }
    case 3: {  res = _num1 * _num2; break; }
    case 4: {
        if(_num2 == 0) { System.out.print("Error, divisor cannot be zero");        flag = false; break; }
        res = _num1 / _num2; 
    }
   }
   if(flag){
   System.out.print("Result: "+ res);
   }
   input.close();
}
}
