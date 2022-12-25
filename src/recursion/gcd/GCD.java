package recursion.gcd;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Greatest common factor is: "+greatestCommonDivider(-8, 18));
    }

    public static int greatestCommonDivider(int a, int b){
        if(a<0 || b<0) return -1;
        if(b == 0){
            return a;
        }
        return greatestCommonDivider(b, a%b);
    }
}

/*
a = 48, b = 18
a%b -> 48%18 = 2 remainder 12 -> (18, 12)
a%b -> 18%12 = 1 remainder 6 -> (12, 6)
a%b -> 12%6 = 0
return 0;
 */

/*
a = 37, b = 7
a%b -> 37%7 = 5 remainder 2 -> (7,2)
a%b -> 7%2 = 3 remainder 1 -> (2,1)
a%b -> 2%1 = 0
return 1
 */
