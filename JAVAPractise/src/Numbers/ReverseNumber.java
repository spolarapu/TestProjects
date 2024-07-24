package Numbers;

public class ReverseNumber {

    public static void main(String k[]){

        int n=121;
        int temp =n;
        int reverse=0;

        while(n>0){
            int lastDigit = n%10;

            reverse = reverse * 10 + lastDigit;

            n/=10;

        }

        System.out.println("Reverse: "+reverse);
        System.out.println((temp==reverse)?"Palindrome": "Not a palindrome");


    }
}
