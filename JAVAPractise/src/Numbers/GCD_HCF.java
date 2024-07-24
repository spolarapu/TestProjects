package Numbers;

public class GCD_HCF {

    public static void main(String k[]){

        int n1=20, n2=15;
        int gcf =0;

        for(int i=1; i<((n1<n2)?n1:n2); i++){

            if(n1%i == 0 && n2%i==0){
                gcf=i;
            }
        }
        System.out.println("GCF:"+gcf);

    }
}
