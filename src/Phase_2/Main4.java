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
        for(int i=0;i<n;i++){
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void  five(int n){
        for(int i=1;i<=n;i++){

            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //stars
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void six(int n){
        for(int i=1;i<=n;i++){

            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("b");
            }

            //star
            for(int j=1;j<=2*i-1;j++){
                if(j%2!=0){
                    System.out.print("*");
                }else{
                    System.out.print("b");
                }
            }

            System.out.println();
        }
    }


    static void seven(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    static void eight(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        //simple(4);
        //one(5);
        //two(5);
        //three(5);
        //four(5);
        //five(5);
        //six(5);
        //seven(5);
        //eight(5);

    }
}
