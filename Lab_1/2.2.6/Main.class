import java.util.*;

public class Main {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("Input 1 for linear equation,\n 2 for linear system, \n 3 for quadratic equation: ");
   int n = Integer.parseInt(input.nextLine());

   switch(n){
    case 1: {  
        System.out.print("Input a: ");
        String a = input.nextLine();
        double _a = Double.parseDouble(a);
        
        System.out.print("Input b: ");
        String b = input.nextLine();
        double _b = Double.parseDouble(b);

        if(_a == 0) { 
            if(_b == 0) {
                System.out.print("Infinitely many solutions");
            } else {
                System.out.print("No solution");
            }
            break; 
        }
        double res = -_b / _a;
        System.out.print(res);
        break; 
    }
    case 2: {  
        System.out.print("Input a11: ");
        String a11 = input.nextLine();
        double _a11 = Double.parseDouble(a11);
        
        System.out.print("Input a12: ");
        String a12 = input.nextLine();
        double _a12 = Double.parseDouble(a12);
        
        System.out.print("Input b1: ");
        String b1 = input.nextLine();
        double _b1 = Double.parseDouble(b1);
        
        System.out.print("Input a21: ");
        String a21 = input.nextLine();
        double _a21 = Double.parseDouble(a21);
        
        System.out.print("Input a22: ");
        String a22 = input.nextLine();
        double _a22 = Double.parseDouble(a22);
        
        System.out.print("Input b2: ");
        String b2 = input.nextLine();
        double _b2 = Double.parseDouble(b2);

        double _d = _a11 * _a22 - _a21 * _a12;
        double _d1 = _b1 * _a22 - _b2 * _a12;
        double _d2 = _a11 * _b2 - _a21 * _b1;

        if(_d == 0) {
            if(_d1 == 0 && _d2 == 0) {
                System.out.print("Infinitely many solutions");
            } else {
                System.out.print("No solution");
            }
            break;
        }
        System.out.print("x1 = " + (_d1 / _d) + ", x2 = " + (_d2 / _d));
        break; 
    }
    case 3: {  
        System.out.print("Input a: ");
        String a = input.nextLine();
        double _a = Double.parseDouble(a);
        
        System.out.print("Input b: ");
        String b = input.nextLine();
        double _b = Double.parseDouble(b);
        
        System.out.print("Input c: ");
        String c = input.nextLine();
        double _c = Double.parseDouble(c);

        if(_a == 0) {
            if(_b == 0) {
                if(_c == 0) {
                    System.out.print("Infinitely many solutions");
                } else {
                    System.out.print("No root");
                }
            } else {
                System.out.print(-_c / _b);
            }
            break;
        }
        
        double _delta = _b * _b - 4 * _a * _c;
        if(_delta < 0) {
            System.out.print("No root");
        } else if(_delta == 0) {
            System.out.print(-_b / (2 * _a));
        } else {
            double _x1 = (-_b + Math.sqrt(_delta)) / (2 * _a);
            double _x2 = (-_b - Math.sqrt(_delta)) / (2 * _a);
            System.out.print("x1 = " + _x1 + ", x2 = " + _x2);
        }
        break; 
    }
   }

   input.close();
}
}