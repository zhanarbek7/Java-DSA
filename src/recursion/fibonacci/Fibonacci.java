package recursion.fibonacci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many fibonacci number you want to see?: ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print(fibonacciNumber(i)+" ");
        }
    }

    public static int fibonacciNumber(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibonacciNumber(n-1)+(fibonacciNumber(n-2));


    }



}
