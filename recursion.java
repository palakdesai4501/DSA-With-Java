// Introduction to recursion
// Write a function that takes in a number and prints it
// Print first 5 numbers: 1 2 3 4 5  
public class recursion {
    public static void main(String[] args) {
        print1(1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

    // here body of the function changes
    static void print5(int n) {
        System.out.println(n);
    }
}