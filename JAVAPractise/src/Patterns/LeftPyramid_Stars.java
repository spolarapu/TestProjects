package Patterns;

public class LeftPyramid_Stars {



    /*
                            *
                          * *
                        * * *
                      * * * *
    * */


    public static void main(String k[]){

        int n=4;

        for(int i=0; i<n; i++){

            // for printing spaces.
            for(int j=0; j<=2*(n-i-1); j++){ // here multiplying with 2 to get an extra space between columns
                System.out.print(" ");
            }

           /* for(int j=2*(n-i); j>=0; j--)
            {
                // printing spaces
                System.out.print(" ");
            }*/


            //for printing stars
            for(int j=0; j<=i; j++){
                System.out.print("* "); // extra space is added to get a space between columns
            }

            System.out.println();
        }


    }
}
