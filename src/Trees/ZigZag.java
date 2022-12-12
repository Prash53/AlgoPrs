package Trees;

import com.sun.source.tree.Tree;

import java.util.*;

public class ZigZag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> qq  = new LinkedList<>();
        qq.offer(root);
        boolean rev=false;
        List<List<Integer>> zigzag = new ArrayList<>();
        while(!qq.isEmpty()){
            List<Integer> ls = new ArrayList<>();
            int size = qq.size();
            for(int i=0;i<size;i++){
                TreeNode tmp = qq.poll();
                ls.add(tmp.val);
                if(tmp.left!=null)
                    qq.add(tmp.left);
                if(tmp.right!=null)
                    qq.add(tmp.right);
            }
            if(rev)
                Collections.reverse(ls);
                rev=!rev;
            zigzag.add(ls);
        }
        return zigzag;
    }

    public static void main(String[] args){
        TreeNode root =new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.right=new TreeNode(7);
        root.right.left=new TreeNode(15);
        List<List<Integer>> ziza = new ZigZag().zigzagLevelOrder(root);
        ziza.stream().forEach(a->System.out.println(a));
    }
}

