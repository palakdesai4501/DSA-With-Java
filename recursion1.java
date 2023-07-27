// Fibonacci number program using recursion
public class recursion1 {
    public static void main(String[] args) {
        for(int i=0; i < 11; i++){
            System.out.println(fiboFormula(i));
        }
    }

    /**
     * This is the formula for calculating the nth fibonacci number using the golden ratio
     * @param n
     * @return nth fibonacci number
     */
    static int fiboFormula(int n){
        return (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    /**
     * This is the recursive function for calculating the nth fibonacci number
     * @param n
     * @return nth fibonacci number
     */
    static int fibo(int n){

        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
