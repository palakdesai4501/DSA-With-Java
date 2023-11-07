package Trees;
public class main2 {
    public static void main(String[] args) {
        BST tree1 = new BST();
        int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        tree1.populate(nums);
        tree1.display();
    }
}
