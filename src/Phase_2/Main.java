package Phase_2;

public class Main {

    public static void main(String[] args) {

        //printnos();
        //printodd();
        //printeven();
        //down();
        //table(8);
        //naturaln(5);
        //evensum(100);
        //oddsum(100);
        //factorial(6);
        //digitproduct(0);
    }


    public static void printnos(){
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void printodd(){
        for(int i=1;i<=100;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }


    static void printeven(){
        for(int i=2;i<=100;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }


    static void down(){
        for(int i=10;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        System.out.println();
    }

    static void naturaln(int n){
        System.out.println("Natural no sum = "+ n*(n+1)/2);
    }

    static void evensum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum += i;

            }
        }
        System.out.println("even sum = "+sum);
    }

    static void oddsum(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum += i;

            }
        }
        System.out.println("odd sum = "+sum);
    }

    static void factorial(int n){
        long product = 1;
        for(int i=n;i>=1;i--){
            product = product *i;
        }
        System.out.println("factorial = "+product);
    }

    static void digitproduct(int n){
        if (n == 0) {
            System.out.println("digitproduct = 0");
            return;
        }
        int temp = Math.abs(n);
        long product = 1;
        while(temp>0){
            int last = temp % 10;
            product = product*last;
            temp /= 10;
        }
        System.out.println("digitproduct = "+product);
    }
}
