package Recursion;

public class SumOfFirst_N_Numbers {

    static int sum=0;
    static int sum( int n){

       /* for(int i=0; i<n; i++){
            sum+=1;
        }*/

        if(n==0){
            return 0;
        }

       return  n+ sum(n-1);

    }

    public static void main(String k[]){
        System.out.println(sum(3));
    }

}
