package Recursion;

public class Print_1to100 {

    static void print(int i, int n){

        if(i>n){
            return;
        }
        System.out.println(i);
        print(i+1, n);

    }

    static void print100To1(int i, int n){

        if(i<0){
            return;
        }
        System.out.println(i);
        print100To1(i-1, n);

    }

    public static void main(String k[]){
        print(1, 100);
        System.out.println("--------------");
        print100To1(100, 100);
    }


}
