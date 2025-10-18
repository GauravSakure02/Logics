package Phase_1;

public class Main4 {
    public static void main(String[] args) {
        //checkCharType(' ');
        //fizzBuzz(30);
        //findMedian(3,5,8);
        //printAmPm(13);
        //checkTaxEligibility(19,500001);
        //checkNumbers(2,3);
        //printDigitAsWord(3);
        //checkWeekdayOrWeekend(7);
        //calculateBill(51);
        //validatePassword("Gaunjjc");
    }

    public static void checkCharType(char ch) {
        if (Character.isLetter(ch)) {
            System.out.println("'" + ch + "' is a Letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println("'" + ch + "' is a Digit.");
        } else {
            System.out.println("'" + ch + "' is Neither (a special character).");
        }
    }


    public static void fizzBuzz(int n) {
        if (n % 15 == 0) { // Check for divisibility by both first
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }
    }

    public static void findMedian(int a, int b, int c) {
        int maxVal = Math.max(a, Math.max(b, c));
        int minVal = Math.min(a, Math.min(b, c));
        int median = (a + b + c) - maxVal - minVal;
        System.out.println("The median value is: " + median);
    }


    public static void printAmPm(int hour) {
        if (hour < 0 || hour > 23) {
            System.out.println("Invalid hour.");
        } else if (hour >= 0 && hour <= 11) {
            System.out.println("It is AM.");
        } else {
            System.out.println("It is PM.");
        }
    }


    public static void checkTaxEligibility(int age, double income) {
        if (age > 18 && income > 500000) {
            System.out.println("Eligible for tax.");
        } else {
            System.out.println("Not eligible for tax.");
        }
    }

    public static void checkNumbers(int a, int b) {
        if (a > 0 && b > 0 && (a + b < 100)) {
            System.out.println("Conditions met: Both are positive and their sum is less than 100.");
        } else {
            System.out.println("Conditions not met.");
        }
    }

    public static void printDigitAsWord(int digit) {
        switch (digit) {
            case 0: System.out.println("Zero"); break;
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 3: System.out.println("Three"); break;
            case 4: System.out.println("Four"); break;
            case 5: System.out.println("Five"); break;
            case 6: System.out.println("Six"); break;
            case 7: System.out.println("Seven"); break;
            case 8: System.out.println("Eight"); break;
            case 9: System.out.println("Nine"); break;
            default: System.out.println("Not a single digit."); break;
        }
    }

    public static void checkWeekdayOrWeekend(int day) {
        if (day >= 1 && day <= 5) {
            System.out.println("It's a weekday.");
        } else if (day == 6 || day == 7) {
            System.out.println("It's a weekend.");
        } else {
            System.out.println("Invalid day number.");
        }
    }

    public static void calculateBill(int units) {
        double bill = 0.0;
        if (units < 0) {
            System.out.println("Invalid units.");
            return;
        }

        if (units <= 50) {
            bill = units * 3.50; // Rate for first 50 units
        } else if (units <= 150) {
            bill = (50 * 3.50) + ((units - 50) * 4.00); // Cost of first 50 + cost of next 100
        } else {
            bill = (50 * 3.50) + (100 * 4.00) + ((units - 150) * 5.20); // Cost of first 150 + cost of the rest
        }
        System.out.println("The total electricity bill is: Rs. " + bill);
    }


    public static void validatePassword(String password) {
        boolean hasDigit = false;
        // Check 1: Length must be at least 8
        if (password.length() < 8) {
            System.out.println("Invalid: Password must be at least 8 characters long.");
            return;
        }

        // Check 2: Must contain at least one digit
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break; // Found a digit, no need to check further
            }
        }

        if (hasDigit) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Invalid: Password must contain at least one digit.");
        }
    }
}
