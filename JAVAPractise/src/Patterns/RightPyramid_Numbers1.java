package Patterns;

public class RightPyramid_Numbers1 {


    /*
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5

    * */

    public static void main(String k[]){

        int n=5;
        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
