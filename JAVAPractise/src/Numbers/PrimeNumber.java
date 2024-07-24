package Numbers;

public class PrimeNumber {

    public static void main(String k[]) {

        int n = 5;
         boolean flag= true;

        if(n==1 || n==2){
            System.out.println("Not a Prime number");
        }else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("Not a prime number");
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("prime number");
            }
        }


    }
}
