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


    static void nine(int n){
        int num =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    static void ten(int n){
        int num =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((num% 10)+" ");
                num++;
            }
            System.out.println();
        }
    }


    static void eleven(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int val = ((i+j)%2);
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

    static void twelve(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int val = ((i+j+1)%2);
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }


    static void thirteen(int n){
        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }


    static void fourteen(int n){
        for(int i=0;i<n;i++){
            char ch = (char)('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }



    static void fifteen(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                char ch = (char)('A'+j);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }


    static void sixteen(int n){
        char ch = 'A';
        for(int i=1;i<=n;i++){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //alpha
            for(int j=1;j<=(2*i-1);j++){
                if (ch <= 'Z') {
                    System.out.print(ch);
                    ch++;
                }
            }
            System.out.println();
        }
    }

    static void eighteen(int n){
        for(int i=1;i<=n;i++){

            //spaces
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }

            //leading digit
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            //trailing digits
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void nineteen(int n){
        //upper
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void twenteen(int n){
        //upper
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower part
        for(int i=n-1;i>=1;i--){

            //spaces
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void twone(int n){
        for(int i=1;i<=n;i++){
            //leading spaces
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }

            //drecresing no
            for(int j=5;j>5-i;j--){
                System.out.print(j);
            }

            //increasing no
            for(int j=5-i+1;j<=5;j++){
                System.out.print(j);
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
        //nine(5);
        //ten(7);
        //eleven(5);
        //twelve(5);
        //thirteen(5);
        //fourteen(26);
        //fifteen(26);
        //sixteen(6);
        //eighteen(5);
        //nineteen(5);
        //twenteen(4);
        
        
        
        twone(5);
    }
}
