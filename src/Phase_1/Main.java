package Phase_1;


public class Main {

    public static void main(String[] args) {
        // You can call any of the methods here to test them.
        System.out.println("--- Testing Number Checks ---");
        checkPositiveOrNegative(-5);
        isEvenOrOdd(10);
        isDivisibleBy5(15);
        isDivisibleBy3And5(30);
        isLeapYear(2024);

        System.out.println("\n--- Testing Comparison Checks ---");
        findLargerOfTwo(10, 20);
        findLargestOfThree(5, 15, 10);

        System.out.println("\n--- Testing Character Checks ---");
        isVowelOrConsonant('A');
        checkCharacterType('$');
    }

    // 1. Positive, Negative, or Zero
    public static void checkPositiveOrNegative(int n) {
        // --- LOGIC ---
        // A simple if-else if-else chain perfectly covers all three cases.
        if (n > 0) {
            System.out.println(n + " is Positive");
        } else if (n < 0) {
            System.out.println(n + " is Negative");
        } else {
            System.out.println(n + " is Zero");
        }
    }

    // 2. Check if a Number is Even or Odd
    public static void isEvenOrOdd(int n) {
        // --- LOGIC ---
        // The modulo operator (%) gives the remainder of a division.
        // If a number divided by 2 has no remainder, it's even.
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }

    // 3. Check if a Number is Divisible by 5
    public static void isDivisibleBy5(int n) {
        // --- LOGIC ---
        // Same logic as the even/odd check. If the remainder when
        // divided by 5 is 0, it's divisible.
        if (n % 5 == 0) {
            System.out.println(n + " is Divisible by 5");
        } else {
            System.out.println(n + " is Not Divisible by 5");
        }
    }

    // 4. Check if Divisible by both 3 and 5
    public static void isDivisibleBy3And5(int n) {
        // --- LOGIC ---
        // The problem requires the number to be divisible by BOTH 3 AND 5.
        // The logical AND operator `&&` ensures both conditions must be true.
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println(n + " is Divisible by both 3 & 5");
        } else {
            System.out.println(n + " is Not divisible by both 3 & 5");
        }
    }

    // 5. Check for a Leap Year
    public static void isLeapYear(int year) {
        // --- LOGIC ---
        // A year is a leap year if it's divisible by 4,
        // UNLESS it's a century year (divisible by 100).
        // HOWEVER, century years divisible by 400 ARE leap years.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is Not a Leap Year");
        }
    }

    // 6. Take Two Numbers and Print the Larger One
    public static void findLargerOfTwo(int a, int b) {
        // --- LOGIC ---
        // A simple if-else if structure to compare two values.
        // The final else handles the case where they are equal.
        if (a > b) {
            System.out.println(a + " is bigger");
        } else if (b > a) {
            System.out.println(b + " is bigger");
        } else {
            System.out.println("Both numbers are equal");
        }
    }

    // 7. Take Three Numbers and Print the Largest
    public static void findLargestOfThree(int a, int b, int c) {
        // --- LOGIC ---
        // Using the built-in Math.max() function is the cleanest approach.
        // We find the max of b and c first, then compare that result with a.
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("The largest number is: " + largest);
    }

    // 9. Vowel or Consonant
    public static void isVowelOrConsonant(char ch) {
        // --- LOGIC ---
        // Converting the character to lowercase simplifies the checks.
        // The switch statement is highly efficient for comparing against multiple values.
        // Your use of fall-through cases is perfect here.
        if (!Character.isLetter(ch)) {
            System.out.println("'" + ch + "' is not an alphabet.");
            return;
        }

        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("'" + ch + "' is a vowel.");
                break;
            default:
                System.out.println("'" + ch + "' is a consonant.");
        }
    }

    // 10. Character Type Check
    public static void checkCharacterType(char ch) {
        // --- LOGIC ---
        // The built-in Character methods are the best way to do this.
        // The final `else` is a catch-all. If a character is not an
        // uppercase letter, lowercase letter, or digit, it IS a special character.
        if (Character.isUpperCase(ch)) {
            System.out.println("'" + ch + "' is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("'" + ch + "' is a lowercase letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println("'" + ch + "' is a digit.");
        } else {
            System.out.println("'" + ch + "' is a special character.");
        }
    }


}