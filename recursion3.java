//print n to 1

public class recursion3 {
    public static void main(String[] args) {
        fun(5);
        
    }

    static void fun(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        fun(n-1);
    }
}
