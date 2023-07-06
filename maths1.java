// Find odd and even numbers using bitwise operator 
// Logic: if the last bit of a number is 1 then it is odd else even 

public class maths1 {
    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n){
        return (n & 1)==1;
    }
    
}
