import java.util.*;

/*
 *    3
 *  7   19
 *     2  14
 *
 * pre: [3, 7, 19, 2, 14] 
 * in: [7, 3, 2, 19, 14]
 */

public class buildtreepreinorder {
  static int preItr = 0; 
  private static class Node {
    int val; Node left, right;
    Node (int x) { val = x; Node left = right = null; } 
  }

  public static void main(String[] args) {

    System.out.println("Hello");
    int[] preorder = {3, 7, 19, 2, 14};
    int[] inorder = {7, 3, 2, 19, 14};
    Node tree = buildTree(preorder, inorder, 0, preorder.length-1);
    printInorder(tree);
  }

  public static Node buildTree(int[] preorder, int[] inorder, int start, int end) {
    if(start > end) { return null; }
    Node ret = new Node (preorder[preItr++]);
    if(start == end) {return ret; }
    int inItr = searchIn(inorder, start, end, ret.val);
    ret.left = buildTree(preorder, inorder, start, inItr-1);
    ret.right = buildTree(preorder, inorder, inItr+1, end);
    return ret;
  } 

  public static int searchIn(int[] arr, int start, int end, int val) {
    for(int i = start; i <= end; i++) {
      if(arr[i] == val) { return i; }
    }
    return 0;
  }

  public static void printInorder(Node root) {
    if (root == null) { return; }
    printInorder(root.left);
    System.out.print(root.val + ", ");
    printInorder(root.right);
  }
}
