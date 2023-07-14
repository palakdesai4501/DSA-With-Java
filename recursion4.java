//print 1 to n
public class recursion4 {
    public static void main(String[] args) {
        funRev(5);
    }

    static void funRev(int n){
        if(n==0){
            return;
        }
        
        funRev(n-1);
        System.out.println(n);
    }
}
