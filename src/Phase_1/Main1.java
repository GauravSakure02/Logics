package Phase_1;

public class Main1 {


    public static void main(String[] args) {
        //check(5,12,7);
        //triangle(1,2,10);
        //grade(92);
        //multiplier(9,5);
        //greeting(22);
        //voting(18);
        //checkEvenOddPair(1,3);
        //checkAlphabetRange('8');
        //printDayName(8);
        printDaysInMonth(2);
    }


    //This code checks if the sum of any two sides is greater than the third.
    // If all three conditions are true, it assigns "Valid Triangle" to the result; otherwise, it assigns "Invalid Triangle".
    static void check(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("This forms a triangle");
        } else {
            System.out.println("This does not forms a triangle");
        }
    }


    // This line uses a nested ternary operator: the outer one checks for validity,
    // and the inner one (if the triangle is valid) classifies it.
    static void triangle(int a, int b, int c) {
        String result = (a + b > c && b + c > a && a + c > b) ?
                (a == b && b == c ? "Valid Equilateral" : (a == b || b == c || a == c ? "Valid Isosceles" : " Valid Scaeles")) : "Invalid Triangle";
        System.out.println(result);
    }

    //grade according to marks
    static void grade(int marks) {

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks: Please enter a value between 0 and 100.");
            return; // Exit the method early
        }
        if (marks > 75) {
            System.out.println("A Grade");
        } else if (marks > 60) {
            System.out.println("B Grade");
        } else if (marks > 50) {
            System.out.println("C Grade");
        } else if (marks > 35) {
            System.out.println("D Grade");
        } else {
            System.out.println("F Grade");
        }
    }


    //The core idea is to use the modulo operator (%).
    // A number A is a multiple of B if A % B equals 0. You must check this in both directions.
    static void multiplier(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("Invalid Multiplier");
        }
        if ((a % b == 0) || (b % a == 0)) {
            System.out.println("One number is multiplier of other");
        } else {
            System.out.println("Nether is multiplier of other");
        }
    }

    /**
     * Prints a greeting based on the hour of the day (0-23).
     */
    static void greeting(int hour) {
        // --- LOGIC ---
        // 1. First, validate the input to handle invalid hours.
        if (hour < 0 || hour > 23) {
            System.out.println("Invalid hour. Please enter a value between 0 and 23.");
            return; // Exit the method
        }

        // 2. Use `&&` to check ranges for different times of the day.
        // The final `else` acts as a catch-all for night hours (20-23 and 0-6).
        if (hour >= 7 && hour <= 10) {
            System.out.println("Good Morning ☀️");
        } else if (hour >= 11 && hour <= 16) {
            System.out.println("Good Afternoon 🏙️");
        } else if (hour >= 17 && hour <= 19) {
            System.out.println("Good Evening 🌇");
        } else {
            System.out.println("Good Night 🌙");
        }
    }


    static void voting(int age){
        if(age <= 0){
            System.out.println("Invalid Age");
            return;
        }
        if(age < 18){
            System.out.println("Not eligible to vote");
        }else{
            System.out.println("Eligible to vote");
        }
    }

    public static void checkEvenOddPair(int num1, int num2) {
        // --- LOGIC ---
        // We use the modulo operator (%) to check for evenness (remainder 0)
        // or oddness (remainder not 0). The `if-else if-else` structure
        // handles the three possible outcomes in a clear order.

        // First, check if both numbers have a remainder of 0 when divided by 2.
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both numbers are even.");

            // If that fails, check if both numbers have a non-zero remainder.
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Both numbers are odd.");

            // If the numbers are not both even and not both odd, they must be a mix.
        } else {
            System.out.println("One is even and one is odd.");
        }
    }

    public static void checkAlphabetRange(char ch) {
        // --- LOGIC ---
        // 1. We first validate that the input is a letter.
        // 2. We convert the character to lowercase to avoid checking for
        //    both 'a'-'m' and 'A'-'M' separately.
        // 3. An if/else statement then cleanly separates the two ranges.

        // Ensure the character is an alphabet letter.
        if (!Character.isLetter(ch)) {
            System.out.println("'" + ch + "' is not an alphabet character.");
            return;
        }

        char lowerCh = Character.toLowerCase(ch);

        // Check which half of the alphabet it falls into.
        if (lowerCh >= 'a' && lowerCh <= 'm') {
            System.out.println("'" + ch + "' is in the first half (a-m).");
        } else {
            System.out.println("'" + ch + "' is in the second half (n-z).");
        }
    }

    public static void printDayName(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day number. Please enter a value between 1 and 7.";
                break;
        }
        System.out.println(dayName);
    }

    public static void printDaysInMonth(int monthNumber) {
        // --- LOGIC ---
        // A switch statement is perfect here. We can group cases that have
        // the same outcome (e.g., all months with 31 days) to make
        // the code very compact and readable.
        switch (monthNumber) {
            // Months with 31 days
            case 1: // Jan
            case 3: // Mar
            case 5: // May
            case 7: // Jul
            case 8: // Aug
            case 10: // Oct
            case 12: // Dec
                System.out.println("31 days");
                break;

            // Months with 30 days
            case 4: // Apr
            case 6: // Jun
            case 9: // Sep
            case 11: // Nov
                System.out.println("30 days");
                break;

            // February
            case 2:
                System.out.println("28 days (ignoring leap year)");
                break;

            default:
                System.out.println("Invalid month number. Please enter a value between 1 and 12.");
                break;
        }
    }
}
