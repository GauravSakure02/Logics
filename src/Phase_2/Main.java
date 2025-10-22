package Phase_2;

public class Main {

    public static void main(String[] args) {

        //printnos();
        //printodd();
        //printeven();
        //down();
        table(8);





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
}
