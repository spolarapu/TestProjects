package Recursion;

public class PrintName_N_Times {
    static int count=0;

    public static String name ="Suresh";
    public static void printName(int times){
        if(count==times){
            return;
        }

        System.out.println(name);
        count+=1;
        printName(times);

    }

    //one more way to do it. instead of using count variable use extra parameter to the method

    static void printNames1(int i, int times){

        if(i>times){
            return;
        }
        System.out.println(name);
        printNames1(i+1, times);
    }




    public static void main(String k[]){
        printName(5);

        System.out.println("-----------------------");
        printNames1(1, 5);
    }

}
