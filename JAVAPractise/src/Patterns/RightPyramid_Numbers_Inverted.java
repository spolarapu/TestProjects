package Patterns;

public class RightPyramid_Numbers_Inverted {


    /*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
    * */

    public static void main(String k[]){

        int n=5;

        for(int i=1; i<=n; i++){

            for(int j=n; j>=i; j--){

                System.out.print(n-j+1+ " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();




         /*
        5 5 5 5 5
        4 4 4 4
        3 3 3
        2 2
        1
    * */

        for(int i=n; i>0; i--){

            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
