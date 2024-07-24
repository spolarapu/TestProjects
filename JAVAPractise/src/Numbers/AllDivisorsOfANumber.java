package Numbers;

public class AllDivisorsOfANumber {

    public static void main(String k[]){

        int n= 10;

        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
