package Trees;

public class Symmetric {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricUtil(root.left, root.right);
    }
    public boolean isSymmetricUtil(TreeNode r,TreeNode l){
        if(l==null &&r==null)
            return true;
        if((r==null &&l!=null) ||(r!=null && l==null))
            return false;
        if(l.val!=r.val)
            return false;
        return isSymmetricUtil(r.left,l.right) && isSymmetricUtil(r.right,l.left);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        root.left.right=new TreeNode(3);
        root.right.right=new TreeNode(5);
        root.left.left=new TreeNode(5);
        System.out.println(new Symmetric().isSymmetric(root));
    }
}
