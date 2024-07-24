package Patterns;

public class LeftPyramid_Alphabets_Inverted {


    /*
        A B C D E
        A B C D
        A B C
        A B
        A

    * */

    public static void main(String k[]){

        int n=5;
        for(int i=0; i<n; i++){

            for(char c = 'A'; c<='A'+(n-i-1); c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
