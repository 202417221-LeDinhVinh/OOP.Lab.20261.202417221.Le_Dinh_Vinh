import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int _year = -1;
        int _month = -1;

        while (true) {
            System.out.print("Input month: ");
            String mStr = input.nextLine();
            
            System.out.print("Input year: ");
            String yStr = input.nextLine();

            try {
                _year = Integer.parseInt(yStr);
                if (_year < 0) {
                    System.out.println("Invalid input. Please enter again.");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter again.");
                continue;
            }

            if (mStr.equals("January") || mStr.equals("Jan.") || mStr.equals("Jan") || mStr.equals("1")) { _month = 1; }
            else if (mStr.equals("February") || mStr.equals("Feb.") || mStr.equals("Feb") || mStr.equals("2")) { _month = 2; }
            else if (mStr.equals("March") || mStr.equals("Mar.") || mStr.equals("Mar") || mStr.equals("3")) { _month = 3; }
            else if (mStr.equals("April") || mStr.equals("Apr.") || mStr.equals("Apr") || mStr.equals("4")) { _month = 4; }
            else if (mStr.equals("May") || mStr.equals("5")) { _month = 5; }
            else if (mStr.equals("June") || mStr.equals("Jun") || mStr.equals("6")) { _month = 6; }
            else if (mStr.equals("July") || mStr.equals("Jul") || mStr.equals("7")) { _month = 7; }
            else if (mStr.equals("August") || mStr.equals("Aug.") || mStr.equals("Aug") || mStr.equals("8")) { _month = 8; }
            else if (mStr.equals("September") || mStr.equals("Sept.") || mStr.equals("Sep") || mStr.equals("9")) { _month = 9; }
            else if (mStr.equals("October") || mStr.equals("Oct.") || mStr.equals("Oct") || mStr.equals("10")) { _month = 10; }
            else if (mStr.equals("November") || mStr.equals("Nov.") || mStr.equals("Nov") || mStr.equals("11")) { _month = 11; }
            else if (mStr.equals("December") || mStr.equals("Dec.") || mStr.equals("Dec") || mStr.equals("12")) { _month = 12; }
            else {
                System.out.println("Invalid input. Please enter again.");
                continue;
            }

            break; 
        }

        boolean _isLeap = false;
        if (_year % 4 == 0) {
            if (_year % 100 == 0) {
                if (_year % 400 == 0) {
                    _isLeap = true;
                }
            } else {
                _isLeap = true;
            }
        }

        int _days = 0;
        switch (_month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                _days = 31; 
                break;
            case 4: case 6: case 9: case 11:
                _days = 30; 
                break;
            case 2:
                if (_isLeap) { 
                    _days = 29; 
                } else { 
                    _days = 28; 
                }
                break;
        }

        System.out.print(_days);
        input.close();
    }
}