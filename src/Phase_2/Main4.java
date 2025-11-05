package Phase_2;

public class Main4 {


    public static void simple(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void one(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void two(int n) {
        for (int i = 1; i <= n; i++) {

            // Spaces (Corrected from n-i-1 to n-i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void three(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void four(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //simple(4);
        //one(5);
        //two(5);
        //three(5);




    }
}
