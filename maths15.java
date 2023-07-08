//Find hcf/gcd of two numbers using recursion 
public class maths15 {
    public static void main(String[] args) {
        System.out.println(gcd(4, 8));
    }

    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, b);
    }
}
