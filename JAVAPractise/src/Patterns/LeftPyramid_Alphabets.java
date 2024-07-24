package Patterns;

public class LeftPyramid_Alphabets {


    /*

        A
        A B
        A B C
        A B C D
        A B C D E

    * */


    public static void main(String k[]){

        int n=5;

        for(int i=0; i<n; i++){

            for(char c='A'; c<='A'+i; c++){
                System.out.print(c);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

       for(int i=0; i<n; i++){

           for(int j=0; j<=i; j++){
               System.out.print((char)('A'+i));
           }

           System.out.println();
       }

    }
}
