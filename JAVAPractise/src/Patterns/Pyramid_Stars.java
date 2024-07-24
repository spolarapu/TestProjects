package Patterns;

public class Pyramid_Stars {

    /*

                    *
                  * * *
                * * * * *
              * * * * * * *
    * */


    public static void main(String k[]){

        int n=4;

        for (int i=0; i<n; i++){

            //print spaces first
            for(int j=0; j<2*(n-i-1); j++){  // here multiplying with 2 to get an extra space between columns
                System.out.print(" ");
            }

            // print stars
            for(int j=0; j<2*i+1; j++){
                System.out.print("* "); // extra space is added to get a space between columns
            }

            // print spaces again
            for(int j=0; j<2*(n-i-1); j++){ // here multiplying with 2 to get an extra space between columns
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
