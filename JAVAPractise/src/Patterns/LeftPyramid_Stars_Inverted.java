package Patterns;

public class LeftPyramid_Stars_Inverted {


    /*
           * * * * *
             * * * *
               * * *
                 * *
                   *
    * */


    public static void main(String k[]){

        int n=5;

        for(int i=0; i<n; i++){

            for(int j=0; j<i; j++){
                System.out.print(" ");
            }

            for(int j=n; j>i;j--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
