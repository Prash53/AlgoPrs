package Trees;

import com.sun.source.tree.Tree;

import java.util.concurrent.atomic.AtomicInteger;

public class MaxSum {
    public int maxPathSum(TreeNode root) {
        AtomicInteger res = new AtomicInteger();
        res.set(Integer.MIN_VALUE);
        maxSumUtil(root,res);
        return res.get();
    }
    public int maxSumUtil(TreeNode root, AtomicInteger i){
        if(root==null)
            return 0;
        int l = maxSumUtil(root.left,i);
        int r=maxSumUtil(root.right,i);
        int maxStPath = Math.max(root.val,root.val+Math.max(l,r));
        int maxRoot = Math.max(maxStPath,root.val+l+r);
        i.set(Math.max(maxRoot,i.get()));
        return maxStPath;
    }

    public static void main(String[] args){
        TreeNode root =new TreeNode(-10);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.right=new TreeNode(7);
        root.right.left=new TreeNode(15);
        System.out.println(new MaxSum().maxPathSum(root));
    }
}
