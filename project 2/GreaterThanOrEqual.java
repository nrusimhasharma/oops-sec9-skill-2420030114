package operators;

import java.util.*;

public class GreaterThanOrEqual{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Enter a: ");
        a = sc.nextInt();

        System.out.println("Enter b: ");
        b = sc.nextInt();

        if(a == b){
            System.out.println("A is equal to b");
        }else if(a > b){
            System.out.println("A is greater than b");
        }else{
            System.out.println("A is lesser than b");
        }



        sc.close();
    }
}
