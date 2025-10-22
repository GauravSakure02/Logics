package Phase_2;

public class Main2 {

    public static void main(String[] args) {
        digitsum(123);
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
}
