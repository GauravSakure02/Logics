package Phase_2;

public class Main3 {

    public static void main(String[] args) {
        //square(5);
        //cube(1);
        //seven(5,20);
        //hcf(1,0);
        //lcm(11,12);
        //factors(30);
        //sumoffactors(30);
        //strong(145);
        //ap(2,1,5);
        gp(2,2,5);

    }

    static void square(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i+" = "+ i*i);
        }
        System.out.println();
    }

    static void cube(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i+" - "+ i*i*i);
        }
        System.out.println();
    }


    static void seven(int a,int b){
        if(a>=b){
            System.out.println("Enter proper numbers");
            return;
        }
        for(int i=a;i<=b;i++){
            if(i%7==0){
                System.out.println(i+" is divisible by 7");
            }

        }
    }

    static void hcf(int a, int b) {
        // Handle cases where one or both inputs are zero or negative if necessary
        // For simplicity, assuming positive inputs based on standard HCF definition
        if (a <= 0 || b <= 0) {
            System.out.println("HCF is typically defined for positive integers.");
            return;
        }

        int hcf = 1; // Default HCF is 1
        int smallest = Math.min(a, b);

        // Loop from the smaller number down to 1
        for (int i = smallest; i >= 1; i--) {
            // Check if 'i' divides BOTH 'a' and 'b' evenly
            if (a % i == 0 && b % i == 0) {
                hcf = i; // Found the highest common factor
                break;   // Exit the loop immediately
            }
        }
        System.out.println("HCF is - " + hcf);
    }

    // Modified to RETURN the HCF value instead of printing it
    static int calculateHCF(int a, int b) {
        // Handle cases where one or both inputs are zero or negative if necessary
        if (a <= 0 || b <= 0) {
            System.out.println("HCF is typically defined for positive integers.");
            // Return a special value like 0 or -1, or throw an exception
            // depending on how you want to handle invalid input.
            return 0; // Returning 0 for simplicity here
        }

        int hcf = 1; // Default HCF is 1
        int smallest = Math.min(a, b);

        for (int i = smallest; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
                break;
            }
        }
        return hcf; // Return the calculated HCF
    }

    static void lcm(int a, int b) {
        // Handle cases where one or both inputs are zero or negative
        if (a == 0 || b == 0) {
            System.out.println("LCM is 0"); // LCM of 0 and any number is 0
            return;
        }
        if (a < 0 || b < 0) {
            System.out.println("LCM is typically defined for positive integers.");
            // Or calculate using absolute values: a = Math.abs(a); b = Math.abs(b);
            return;
        }

        // Call the HCF method that returns the value
        int hcfResult = calculateHCF(a, b);

        // Check if HCF calculation was valid (optional, based on hcf method's error handling)
        if (hcfResult == 0) {
            System.out.println("Could not calculate LCM due to invalid HCF.");
            return;
        }


        // Calculate LCM using the formula: LCM = (a * b) / HCF
        // Use 'long' for the product to prevent potential integer overflow
        long product = (long) a * b;
        long lcmResult = product / hcfResult;

        System.out.println("LCM is - " + lcmResult);
    }


    static void factors(int n){
        System.out.println("The factors of " + n +"  are -");
        for(int i=1;i<=n;i++){
            if(n % i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    static void sumoffactors(int n){

        long sum = 0;
        for(int i=1;i<=n;i++){
            if(n % i==0){
                sum += i;
            }
        }
        System.out.println("The sum is -"+ sum);
    }

    static int fact(int n){
        if(n==0) return 1;
        long fact = 1;
        for(int i=n;i>0;i--){
            fact = fact * i;
        }
        return (int)fact;
    }


    static void strong(int n){
        int temp = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum += fact(digit);
            n /= 10;
        }
        if(sum==temp){
            System.out.println(temp+" is a strong number");
        }else{
            System.out.println(temp+" is not a strong number");
        }
    }

    static void ap(int a,int d,int n){
        int current = a;
        for(int i=1;i<=n;i++){
            System.out.print(current+" ");
            current += d;
        }
    }

    static void gp(int a, int r, int n) {
        long current = a;
        for (int i = 1; i <= n; i++) {
            // Changed from println to print to match the 'ap' method's output style
            System.out.print(current + " ");
            current *= r;
        }
        System.out.println(); // Add a final newline after the series is done
    }
}
