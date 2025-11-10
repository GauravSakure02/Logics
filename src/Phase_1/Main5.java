package Phase_1;

public class Main5 {

    public static void main(String[] args) {
        //pythagoras(3,45,5);
        //checkValidDate(29,2);
        //printcloclAngle(25,0);
        //arithmetic(1,3,2);
        //geometric(1,2,4);
        //checkDigitSum(122);
        //ompareSumAndProduct(101);
        //printCentury(2001);

 
    }

    public static void pythagoras(int a,int b,int c){
        int max = Math.max(a,Math.max(b,c));

        if((a*a+b*b+c*c)==2*max*max){
            System.out.println("Above numbers are in pythagoras triplet");
        }else{
            System.out.println("Numbers are not in pythagoras triplet");
        }
    }


    public static void checkValidDate(int day, int month) {
        // --- LOGIC ---
        // We use a switch statement on the month to determine the valid range for the day.
        // Cases are grouped for months with the same number of days.

        switch (month) {
            // Months with 31 days
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                if (day >= 1 && day <= 31) {
                    System.out.println("Date is valid. ✅");
                } else {
                    System.out.println("Invalid day for a month with 31 days. ❌");
                }
                break;

            // Months with 30 days
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                if (day >= 1 && day <= 30) {
                    System.out.println("Date is valid. ✅");
                } else {
                    System.out.println("Invalid day for a month with 30 days. ❌");
                }
                break;

            // February
            case 2:
                if (day >= 1 && day <= 28) {
                    System.out.println("Date is valid. ✅");
                } else {
                    System.out.println("Invalid day for February (must be 1-28). ❌");
                }
                break;

            // Default case for invalid month numbers
            default:
                System.out.println("Invalid month. Please enter a month from 1 to 12. ❌");
                break;
        }
    }

    static void printcloclAngle(int hours,int minutes){
        if(hours<0||hours>23||minutes<0||minutes>23){
            System.out.println("Invalid time");
            return;
        }

        hours = hours % 12;
        double minuteangle = minutes *6;
        double hourangle = 0.5 * (hours * 60 + minutes);

        double anglediff = Math.abs(hourangle-minuteangle);
        double angle = Math.min(anglediff,360-anglediff);
        System.out.println(angle);
    }

    static void arithmetic(int a,int b,int c){
        if((b-a)==(c-b)){
            System.out.println("Numbers are in AP");
        }else{
            System.out.println("Numbers are not in AP");
        }
    }

    static void geometric(int a,int b,int c){
        if((b*b)==(a*c)){
            System.out.println("Numbers are in GP");
        }else{
            System.out.println("Numbers are not in GP");
        }
    }


    public static void checkDigitSum(int num) {
        // --- LOGIC ---
        // 1. Validate the input to ensure it is a 3-digit number.
        if (num < 100 || num > 999) {
            System.out.println("Invalid input: Not a 3-digit number.");
            return;
        }

        // 2. Isolate the digits.
        int firstDigit = num / 100;         // Example: 358 / 100 = 3
        int middleDigit = (num / 10) % 10;  // Example: (358 / 10) % 10 = 35 % 10 = 5
        int lastDigit = num % 10;           // Example: 358 % 10 = 8

        // 3. Check if the sum of the first and last equals the middle.
        if (firstDigit + lastDigit == middleDigit) {
            System.out.println("Yes, in " + num + ", the sum of " + firstDigit + " and " + lastDigit + " is " + middleDigit + ".");
        } else {
            System.out.println("No, in " + num + ", the sum of " + firstDigit + " and " + lastDigit + " is not " + middleDigit + ".");
        }
    }

    public static void compareSumAndProduct(int num) {
        // --- LOGIC ---
        // 1. Initialize sum to 0 and product to 1 (not 0, to avoid multiplication by zero).
        int sum = 0;
        int product = 1;
        int originalNum = num; // Keep a copy for the final print statement

        // 2. Use a loop to process the number until it becomes 0.
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            sum += digit;         // Add it to the sum
            product *= digit;     // Multiply it with the product
            num /= 10;            // Remove the last digit
        }

        System.out.println("For " + originalNum + ": Sum = " + sum + ", Product = " + product);

        // 3. Compare the final sum and product.
        if (sum > product) {
            System.out.println("Result: Sum is greater than Product.");
        } else {
            System.out.println("Result: Sum is not greater than Product.");
        }
    }


    public static void compareDates(int day1, int month1, int day2, int month2) {
        // --- LOGIC ---
        // Compare months first. If they are different, the earlier month wins.
        if (month1 < month2) {
            System.out.println("Date 1 (" + day1 + "/" + month1 + ") comes first.");
        } else if (month2 < month1) {
            System.out.println("Date 2 (" + day2 + "/" + month2 + ") comes first.");
        } else {
            // If months are the same, then compare the days.
            if (day1 < day2) {
                System.out.println("Date 1 (" + day1 + "/" + month1 + ") comes first.");
            } else if (day2 < day1) {
                System.out.println("Date 2 (" + day2 + "/" + month2 + ") comes first.");
            } else {
                System.out.println("Both dates are the same.");
            }
        }
    }


    public static void printCentury(int year) {
        // --- LOGIC ---
        // 1. Handle the edge case of years that end in '00' (e.g., 1900, 2000).
        //    For these, the century is simply the year divided by 100.
        // 2. For all other years, the century is the year divided by 100, plus one.
        int century;
        if (year <= 0) {
            System.out.println("Invalid year.");
            return;
        }

        if (year % 100 == 0) {
            century = year / 100;
        } else {
            century = (year / 100) + 1;
        }

        // Optional: Add the correct suffix (st, nd, rd, th)
        String suffix;
        if (century % 10 == 1 && century % 100 != 11) {
            suffix = "st";
        } else if (century % 10 == 2 && century % 100 != 12) {
            suffix = "nd";
        } else if (century % 10 == 3 && century % 100 != 13) {
            suffix = "rd";
        } else {
            suffix = "th";
        }

        System.out.println("The year " + year + " is in the " + century + suffix + " century.");
    }
}
