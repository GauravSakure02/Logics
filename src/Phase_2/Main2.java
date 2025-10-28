package Phase_2;

public class Main2 {

    public static void main(String[] args) {
        //digitsum(123);
        //reverse(108);
        //palindrome(888);
        //noOfDigits(8888);
        //armstrong(1634);
        //perfectno(28);
        //System.out.println(prime(10));
        //printPrime();




    }

    static void digitsum(int n){
        if(n==0){
            System.out.println("digitsum = 0");
            return;
        }

        int temp = Math.abs(n);
        long sum = 0;
        while(temp>0){
            int last = temp % 10;
            sum = sum+last;
            temp /= 10;
        }
        System.out.println("Digit sum = "+ sum);
    }

    static void reverse(int n) {

        // Use 'long' to prevent overflow
        long reversedNum = 0;
        int temp = Math.abs(n);

        while (temp > 0) {
            int last = temp % 10;
            reversedNum = (reversedNum * 10) + last;
            temp /= 10;
        }

        // Fixed the print statement
        System.out.println("Reverse of number = " + reversedNum);
    }

    static void palindrome(int n){
        if(n<=0){
            System.out.println("Not a palindrome");
            return;
        }

        long reversedNum = 0;
        int temp = Math.abs(n);
        while(temp>0){
            int last = temp % 10;
            reversedNum = (reversedNum* 10)+ last;
            temp /= 10;
        }
        if(n==reversedNum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }

    static void noOfDigits(int n){
        if(n<=0){
            System.out.println("No of digits = " + 0);
            return;
        }
        int count = 0;
        int temp = Math.abs(n);

        while (temp > 0) {
            int last = temp % 10;
            count++;
            temp /= 10;
        }
        System.out.println("No of digits = " + count);
    }


    static void armstrong(int n){
        if(n<=0){
            System.out.println(n+" is not a armstrong number");
            return;
        }
        int digitCount = 0;
        int temp = n;
        while(temp >0){
            temp /= 10;
            digitCount++;
        }

        long sum = 0;
        temp= n;
        while(temp>0){
            int last = temp % 10;
            sum += Math.pow(last,digitCount);
            temp /= 10;
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }

    static void perfectno(int n){
        if(n<=0){
            System.out.println(n+" is not a perfect number");
            return;
        }
        int sumofdivisor = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sumofdivisor += i;
            }
        }
        if(sumofdivisor==n){
            System.out.println(n+" is a perfect number.");
        }else{
            System.out.println(n+" is not a perfect number.");
        }
    }


    static boolean prime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i ==0){
                return  false;
            }
        }
        return true;
    }

    static void printPrime(){
        for(int i=2;i<=100;i++){
            if(prime(i)==true){
                System.out.println(i+" is a prime number.");
            }else{
                System.out.println(i+" is not a prime number.");
            }
        }
    }
}
