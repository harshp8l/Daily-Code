import java.util.*;

public class binarytreelevelorder {
    
    private static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x;}
    }
    
    public static void main (String[] args){
        TreeNode sample = new TreeNode(3);
        sample.left = new TreeNode(9);
        sample.right = new TreeNode(20);
        sample.right.left = new TreeNode(15);
        sample.right.right = new TreeNode(7);
        for (List<Integer> list : levelOrder(sample)) {
            for (Integer num : list) {
                System.out.print(num + " "); 
            }

            System.out.println();
        } 
    }
    
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return null;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currLevel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.remove();
                currLevel.add(curr.val);
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
            
            result.add(currLevel);
        }
        return result;
    }
}