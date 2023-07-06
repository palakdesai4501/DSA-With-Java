//Find nth magic number 
// Logic: 1st magic number is 5^0, 2nd magic number is 5^1, 3rd magic number is 5^2 and so on... 
//1 = 001(5^3 + 5^2 + 5^1 -> 5)
//2 = 010(5^3 + 5^2 + 5^1 -> 25)
//3 = 011(5^3 + 5^2 + 5^1 -> 30)
//4 = 100(5^3 + 5^2 + 5^1 -> 125)
//5 = 101(5^3 + 5^2 + 5^1 -> 130) & so on....
public class maths3 {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int base = 5;

        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
