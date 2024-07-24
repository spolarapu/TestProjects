package Patterns;

public class Pyramid_Stars_Inverted {

    /*
            * * * * *
              * * *
                *
    * */

    public static void main(String k[]){

        int n=3;

        for (int i=0; i<n; i++){

            // print spaces
            for(int j=0; j<2*i; j++){ // here multiplying with 2 to get an extra space between columns
                System.out.print(" ");
            }

            // for printing stars
            for(int j=0; j<2*n-(2*i+1); j++){
                System.out.print("* "); // extra space is added to get a space between columns
            }

            for(int j=0; j<2*i; j++){ // here multiplying with 2 to get an extra space between columns
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}
