package Numbers;

public class SumOfDigits {


    public static void main(String k[]){

        int n=123;
        int sum = 0;
        int count = 0;

        //using while
        /*while(n>0){

            int digit =  n%10;
            sum=  sum+digit;
            count =  count+1;
            n=n/10;
        }*/

        //using for
        for(int i =n; i>0; i/=10){

            int digit =  i%10;
            sum=  sum+digit;
            count =  count+1;

        }

        System.out.println("Sum of digits: "+sum);
        System.out.println("Count of digits: "+count);
    }
}
