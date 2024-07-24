package Recursion;

public class Print100Numbers {

    static int number=0;
    public static void printNumbers(){
        if(number>100){
            return;
        }

        System.out.println(number);
        number+=1;
        printNumbers();


    }



    public static void main(String k[]){

        printNumbers();
    }
}
