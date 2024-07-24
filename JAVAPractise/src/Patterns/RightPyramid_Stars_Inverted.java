package Patterns;

public class RightPyramid_Stars_Inverted {

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

            for(int j=n; j>i; j--){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
