// Sieve of eratosthenes
// Time Complexity: O(n*log(log(n)))
// Space Complexity: O(n)
// Logic:
// 1. Create a boolean array of size n+1
// 2. Mark all the numbers which are not prime as true
// 3. Mark all the multiples of prime numbers as true
// 4. Print all the numbers which are not marked as true
// Input: n = 40
// Output: 2 3 5 7 11 13 17 19 23 29 31 37
public class maths11 {
    public static void main(String[] args) {
        int n=40;
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }

    /**
     * 
     * @param n
     * @param primes
     */
    //false in array means number is prime
    static void sieve(int n, boolean[] primes){
        for(int i=2; i*i<=n; i++){
            if(!primes[i]){
                for(int j=i*2; j<=n; j+=i){
                    primes[j] =true;
                }
            }
        }

        for(int i=2; i<=n; i++){
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
