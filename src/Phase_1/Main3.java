package Phase_1;

public class Main3 {

    public static void main(String[] args) {

        //checkDistinct(251);
        //checkMiddle(101);
        //checkExtreme(100);
        //absolute(100);
        //seven(10);
        //coordinates(-10,10);
        notes(1500);


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
}
