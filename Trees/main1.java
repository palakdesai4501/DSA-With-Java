// implement binarytree
package Trees;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.prettyDisplay();
        tree.preOrder();
        tree.inOrder();
    }
}
