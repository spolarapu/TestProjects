package Numbers;

public class ArmstrongNumber {

    // a number that is equal to the sum of its digits each raised to the power of the number of digits



    public static void main(String k[]){

        int n=153;
        int temp = n;
        int sum= 0;

        //find number of digits first
        int exponent =  String.valueOf(n).length(); //this is a optimal approach. we can write logic to find number of digits in a number

        while(n>0){

            int digit =  n%10;
            sum += (int) (Math.pow(digit, exponent));
            n/=10;
        }

        System.out.println((temp==sum)?"Armstrong":"Not Armstrong");
    }

}
