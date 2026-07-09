// Last updated: 09/07/2026, 09:51:20
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)
        return ans;
     
       
           ans.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        return ans;
      
       }
    
    }
