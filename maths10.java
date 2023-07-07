// Find prime numbers from 1 to n
// Input: n = 20
// Output: 2 3 5 7 11 13 17 19
public class maths10 {
    public static void main(String[] args) {
        int n=20;
        for(int i=1; i<=n; i++){
            System.out.println(i+ " " + isPrime(i));
        }
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        int c=2;
        while(c*c <=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }

}
