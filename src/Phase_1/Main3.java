package Phase_1;

public class Main3 {

    public static void main(String[] args) {

        //checkDistinct(251);
        //checkMiddle(101);
        //checkExtreme(100);
        //absolute(100);
        //seven(10);
        //coordinates(-10,10);
        //notes(1500);
        //numberinrange(100);
        //angle(60,60);
        square(25);

    }

    static void checkDistinct(int num){
        if(num < 100 || num >999){
            System.out.println("Number out of range");
            return;
        }

        int first = num / 100;
        int second = (num / 10)% 10;
        int third = num % 10;

        if(first != second && second != third && first != third){
            System.out.println("All digits are distict");
        }else{
            System.out.println("All digits are not distict");
        }
    }

    static void checkMiddle(int num){
        if(num < 100 || num >999){
            System.out.println("Number out of range");
            return;
        }

        int first = num / 100;
        int middle = (num / 10)% 10;
        int last = num % 10;

        if(middle > first && middle > last){
            System.out.println("Middle Numbers is largest");
        }else if(middle < first && middle < last){
            System.out.println("Middle Numbers is smallest");
        }else{
            System.out.println("Middle Numbers is Neither");
        }
    }

    static void checkExtreme(int num){
        if(num < 1000 || num >9999){
            System.out.println("Number out of range");
            return;
        }

        int first = num / 1000;
        int last = num % 10;

        if(first==last){
            System.out.println("digits are equal");
        }else{
            System.out.println("digits are distict");
        }
    }

    static void absolute(int n){
        int num  = Math.abs(n);
        if(num < 10){
            System.out.println("Single digit");
        }else if(num < 100){
            System.out.println("Double digit");
        }else{
            System.out.println("MutiDigit");
        }
    }

    static void seven(int n){
        boolean multiper = (n % 7 ==0);
        boolean endsWith = (Math.abs(n) % 10 ==7);

        if( multiper || endsWith){
            System.out.println("The number is either a multiple of 7 or ends with 7");
        }else{
            System.out.println("The number is neither a multiple of 7 nor ends with 7");
        }
    }

    /**
     * Determines the location of a point (x, y) on a Cartesian plane.
     */
    static void coordinates(int x, int y) {
        // --- LOGIC ---
        // The structure correctly checks the most specific cases (origin, axes) first
        // before moving to the broader quadrant checks.

        if (x == 0 && y == 0) {
            System.out.println("The point is at the Origin (0,0).");
        } else if (x == 0) {
            System.out.println("The point lies on the Y-axis.");
        } else if (y == 0) {
            System.out.println("The point lies on the X-axis.");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrant I (+,+)");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant II (-,+)");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant III (-,-)");
        } else { // This is the only remaining possibility (x > 0 and y < 0)
            System.out.println("Quadrant IV (+,-)");
        }
    }

    /**
     * Checks if an amount can be formed using notes of 100, 500, and 2000.
     */
    static void notes(int amt) {
        // --- LOGIC ---
        // Since 100 is the smallest denomination, any valid amount must be
        // a multiple of 100. Also, the amount cannot be negative.
        // This single if-condition handles both checks efficiently.

        if (amt < 0 || amt % 100 != 0) {
            System.out.println("The amount cannot be formed by these notes.");
        } else {
            System.out.println("Yes, the amount can be formed by these notes.");
        }
    }

    static void numberinrange(int n){
        if(n< 100||n>999){
            System.out.println("Number out of range");
        }else{
            System.out.println("Number between 100 and 999");
        }
    }

    static void angle(double n, double r) {
        // --- OPTIMIZATION ---
        // Handle invalid cases first and `return` to exit the method early.
        // This avoids nesting the main logic inside an `else` block.
        if (n <= 0 || r <= 0 || (n + r >= 180)) {
            System.out.println("Invalid angles. The two angles cannot form a valid triangle.");
            return;
        }

        double third = 180 - (n + r);
        System.out.println("The third angle is " + third);
    }

    static void square(int n) {
        // --- FIX & OPTIMIZATION ---
        // 1. Handle the negative case first and return.
        if (n < 0) {
            System.out.println(n + " is not a perfect square (cannot be negative).");
            return;
        }

        // 2. The loop will correctly handle 0 and 1.
        // 3. Remove the `isFound` flag. If we find the answer,
        //    we can print and return immediately.

        // Loop from i=0 to avoid missing the n=0 case.
        // The condition `i * i <= n` is efficient because it stops
        // the search once the square of i exceeds n.
        for (long i = 0; i * i <= n; i++) {
            if (i * i == n) {
                System.out.println(n + " is a perfect square.");
                return; // Found it, exit the method.
            }
        }

        // If the loop finishes without finding a match, then it's not a perfect square.
        System.out.println(n + " is not a perfect square.");
    }
}
