package Patterns;

public class LeftPyramid_Numbers_Incremental {

    /*

        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15

    * */

    public static void main(String k[]){

        int n=5;
        int num=1;
        for(int i=0; i<n; i++){

            for(int j=0; j<=i; j++){

                System.out.print(num);
                num= num+1;
            }

            System.out.println();
        }

    }
}
