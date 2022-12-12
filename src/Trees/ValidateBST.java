package Trees;

import com.sun.source.tree.Tree;

/**
 * Definition for a binary tree node.*/
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
       return validUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    public boolean validUtil(TreeNode root,int min,int max){
        if(root==null)
            return true;
        if(root.val>=max || root.val<=min)
            return false;
       return validUtil(root.left,root.left.val,max) && validUtil(root.right,min,root.right.val);
    }

    public static void main(String[] args){

    }
}
