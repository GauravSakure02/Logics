package Phase_1;


//1. Positive, Negative, or Zero
public static void check(int n) {
    // --- LOGIC ---
    // A simple if-else if-else chain perfectly covers all three cases.
    if (n > 0) {
        System.out.println("Positive");
    } else if (n < 0) {
        System.out.println("Negative");
    } else {
        System.out.println("Zero");
    }
}

//2. Check if a Number is Even or Odd
public static void check(int n) {
    // --- LOGIC ---
    // The modulo operator (%) gives the remainder of a division.
    // If a number divided by 2 has no remainder, it's even.
    // The `else if` is redundant; if it's not even, it must be odd.
    if (n % 2 == 0) {
        System.out.println("Even");
    } else {
        System.out.println("Odd");
    }
}

//3. Check if a Number is Divisible by 5
public static void check(int n) {
    // --- LOGIC ---
    // Same logic as the even/odd check. If the remainder when
    // divided by 5 is 0, it's divisible. An `else` is sufficient.
    if (n % 5 == 0) {
        System.out.println("Divisible by 5");
    } else {
        System.out.println("Not Divisible by 5");
    }
}

//4. Check if Divisible by both 3 and 5
public static void check(int n) {
    // --- LOGIC ---
    // The problem requires the number to be divisible by BOTH 3 AND 5.
    // The logical AND operator `&&` ensures both conditions must be true.
    if (n % 3 == 0 && n % 5 == 0) {
        System.out.println("Divisible by both 3 & 5");
    } else {
        System.out.println("Not divisible by both 3 & 5");
    }
}

//5. Check for a Leap Year
public static void check(int year) {
    // --- LOGIC ---
    // A year is a leap year if it's divisible by 4,
    // UNLESS it's a century year (divisible by 100).
    // HOWEVER, century years divisible by 400 ARE leap years.
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        System.out.println("Leap Year");
    } else {
        System.out.println("Not a Leap Year");
    }
}

//6. Take Two Numbers and Print the Larger One
public static void check(int a, int b) {
    // --- LOGIC ---
    // The ternary operator is a concise if-else.
    // This version also handles the case where numbers are equal.
    if (a > b) {
        System.out.println("a is bigger");
    } else if (b > a) {
        System.out.println("b is bigger");
    } else {
        System.out.println("Both numbers are equal");
    }
}

//7. Take Three Numbers and Print the Largest
public static void check(int a, int b, int c) {
    // --- LOGIC ---
    // Using the built-in Math.max() function is the cleanest approach.
    // We find the max of b and c first, then compare that result with a.
    int largest = Math.max(a, Math.max(b, c));
    System.out.println("The largest number is: " + largest);
}

//9. Vowel or Consonant
public static void check(char ch) {
    // --- LOGIC ---
    // Converting the character to lowercase simplifies the checks.
    // The switch statement is highly efficient for comparing against multiple values.
    // Your use of fall-through cases is perfect here.
    if (!Character.isLetter(ch)) {
        System.out.println(ch + " is not an alphabet.");
        return;
    }

    switch (Character.toLowerCase(ch)) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println(ch + " is a vowel.");
            break;
        default:
            System.out.println(ch + " is a consonant.");
    }
}


//10. Character Type Check
public static void check(char ch) {
    // --- LOGIC ---
    // The built-in Character methods are the best way to do this.
    // The final `else` is a catch-all. If a character is not an
    // uppercase letter, lowercase letter, or digit, it IS a special character.
    if (Character.isUpperCase(ch)) {
        System.out.println(ch + " is an uppercase letter.");
    } else if (Character.isLowerCase(ch)) {
        System.out.println(ch + " is a lowercase letter.");
    } else if (Character.isDigit(ch)) {
        System.out.println(ch + " is a digit.");
    } else {
        System.out.println(ch + " is a special character."); // Corrected message
    }
}
