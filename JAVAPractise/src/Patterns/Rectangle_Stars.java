package Patterns;

import java.util.Scanner;

public class Rectangle_Stars {

    // outer loop is for number of rows
    // innner loop is for printing pattern

    /*
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *

    * */

    public static void main(String k[]){

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N value:");
        if(scanner.hasNext()) {
            n = scanner.nextInt();

            for (int i = 0; i <= n; i++) {

                for (int j = 0; j <= n; j++) {

                    System.out.print("* ");
                }

                System.out.println();
            }
        }

    }
}
