package Patterns;

public class LeftPyramid_BinaryNumbers {


    /*

            1
            0 1
            1 0 1
            0 1 0 1


    * */


    public static void main(String k[]){

        int n=5;

        int start =1;

        for(int i=1; i<=n; i++){

            if(i%2==0)
                start=1;
            else
                start=0;

            for(int j=1; j<=i; j++){
                System.out.print(start);
                start = 1- start;
            }

            System.out.println();

        }
    }
}
