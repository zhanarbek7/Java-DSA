package recursion.factorial;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        if(n==1)
            return n;
        else{
            return n*(factorial(n-1));
        }

        // Stack Memory
        // 5 * factorial(5-1) = 5 * 24 = 120
        // 4 * factorial(4-1) = 4 * 6 = 24
        // 3 * factorial(3-1) = 3 * 2 = 6
        // 2 * factorial(2-1) = 2 * 1 = 2
        // 1 = 1
    }
}
