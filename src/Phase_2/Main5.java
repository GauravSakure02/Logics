package Phase_2;

public class Main5 {

        public static int calculateDigitSum(int n) {
            int sum = 0;
            int temp = n; // Use a temp variable so 'n' isn't destroyed

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }
            return sum;
        }

        static void count(){
            int count = 0;
            for(int i=1;i<=500;i++){
                if((i % 7 ==0) &&(i % 5 != 0)){
                    count += 1;
                }
            }
            System.out.println("The no is - "+ count);
        }

    static boolean isPalindrome(int n) {

        if (n < 0) {
            return false;
        }

        long reversed = 0;
        int temp = n;

        while (temp > 0) {
            int last = temp % 10;
            reversed = (reversed * 10) + last;
            temp /= 10;
        }
        return n == reversed;
    }


    static void div(){
            int count = 0;
        for(int i=1;i<=50;i++){
            if((i%7==0) && (i%5!=0)){
                count++;
            }
        }
        System.out.println("The no is - "+ count);

    }

    static int  digitsum(int n){
            int sum =0;
            int temp =n;
            while(temp>0){
                int last = temp % 10;
                sum += last;
                temp /= 10;
            }
            return sum;
    }


    static void largestsmallest(String n) {
        int min = 9;
        int max = 0;

        // Loop through every character in the string
        for (int i = 0; i < n.length(); i++) {
            // Convert character to integer number (char '0' is ASCII 48)
            int digit = n.charAt(i) - '0';

            if (digit > max) {
                max = digit;
            }
            if (digit < min) {
                min = digit;
            }
        }
        System.out.println("Smallest - " + min + " Largest - " + max);
    }
        public static void main(String[] args) {
            /*for (int i = 1; i <= 100; i++) {
                int digitSum = calculateDigitSum(i);
                if (digitSum % 2 == 0) {
                    System.out.println(i);
                }
            }*/
            //count();
            /*for(int i=1;i<=50;i++){
                System.out.println(i+"-"+palindrome(i));
            }*/

            //div();

            /*for(int i=1;i<=100;i++){
                int sum = digitsum(i);
                if(sum % 3==0){'
                    System.out.println(i+"-"+sum);
                }
            }*/


            largestsmallest("0001");
        }
    }

