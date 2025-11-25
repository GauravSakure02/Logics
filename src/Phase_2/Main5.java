package Phase_2;

import java.util.Scanner;

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

    /*static void printevenbits(int n){
        System.out.println("Numbers from 1 to " + n + " with even 1s:");
        for(int i=1;i<=n;i++){
            if(hasevenbits(i)){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }*/

    static boolean hasevenbits(int n){
            int count = 0;
            while(n>0){
                if((n & 1)==1){
                    count++;
                }
                n >>= 1;
            }
            return count % 2==0;
    }

    static void printevenbits(int n){
            for(int i=1;i<=n;i++){
                if(Integer.bitCount(i)% 2==0){
                    System.out.print(i+" ");
                }
            }
    }

    static void pattern(int n){
        for(int i=1;i<=n;i++){
            int sq = i*i;
            for(int j=1;j<=i;j++){
                System.out.print(sq+" ");
            }
            System.out.println();
        }
    }


    static void fact(int n){
        long fac = 1;
        for(int i=1;i<=n;i++){
            fac = fac*i;
            System.out.println("The factorial of "+ i +" is - "+ fac);
        }
    }

        static void evnoddsum(int n){
            int even =0,odd=0;
            n=Math.abs(n);
            int temp = n;
            while(temp>0){
                int digit = temp % 10;
                if(digit % 2==0){
                    even += digit;
                }
                if(digit % 2 !=0){
                    odd += digit;
                }
                temp /= 10;
            }

            System.out.println("Sum of Even Digits: " + even);
            System.out.println("Sum of Odd Digits: " + odd);

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


            //largestsmallest("0001");
            //printevenbits(20);
            //pattern(5);
            //fact(5);
            //evnoddsum(123456);


            Scanner scanner = new Scanner(System.in);
            int sum = 0;

            System.out.println("Enter 5 numbers:");

            for (int i = 1; i <= 5; i++) {
                System.out.print("Number " + i + ": ");
                int number = scanner.nextInt();

                // If the user enters 0, skip adding it
                if (number == 0) {
                    continue;
                }

                sum += number;
            }

            System.out.println("Sum of all non-zero numbers: " + sum);


        }
    }

