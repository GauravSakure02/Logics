package Phase_1;

public class Main1 {


    public static void main(String[] args) {
        //check(5,12,7);
    }




    //This code checks if the sum of any two sides is greater than the third.
    // If all three conditions are true, it assigns "Valid Triangle" to the result; otherwise, it assigns "Invalid Triangle".
    static void check(int a,int b,int c){
       if((a+b >c) && (a+c >b) && (b+c > a)){
           System.out.println("This forms a triangle");
       }else{
           System.out.println("This does not forms a triangle");
       }
    }


}
