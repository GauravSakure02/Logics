package Phase_1;

public class Main1 {


    public static void main(String[] args) {
        //check(5,12,7);
        triangle(1,2,10);
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



    // This line uses a nested ternary operator: the outer one checks for validity,
    // and the inner one (if the triangle is valid) classifies it.
    static void triangle(int a,int b,int c){
        String result = (a+b>c && b+c >a && a+c >b) ?
                (a==b && b==c ? "Valid Equilateral" : (a==b || b==c || a==c ? "Valid Isosceles" : " Valid Scaeles")) : "Invalid Triangle";
        System.out.println(result);
    }

}
