package Phase_1;

public class Main3 {

    public static void main(String[] args) {

        //checkDistinct(251);
        //checkMiddle(101);
        //checkExtreme(100);
        //absolute(100);
        seven(10);
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
}
