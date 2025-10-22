package Phase_2;

public class Main {

    public static void main(String[] args) {

        //printnos();
        //printodd();
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
}
