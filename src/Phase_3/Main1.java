package Phase_3;

public class Main1 {


    static void print1_n(int n){
        if(n==0) return;

        print1_n(n-1);
        System.out.println(n);
    }


    static void printn_1(int n){
        if(n==0) return;
        System.out.println(n);
        printn_1(n-1);
    }


    public static void main(String[] args) {
        print1_n(10);
        printn_1(10);
    }
}
