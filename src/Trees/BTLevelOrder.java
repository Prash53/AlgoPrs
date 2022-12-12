package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTLevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> qq = new LinkedList<>();
        qq.add(root);
        List<List<Integer>> result = new ArrayList<>();
        while(!qq.isEmpty()){
            int size=qq.size();

            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode tmp = qq.poll();
                list.add(tmp.val);
                if(tmp.left!=null)
                    qq.add(tmp.left);
                if(tmp.right!=null)
                    qq.add(tmp.right);
            }
            result.add(list);
         }
        return result;
    }
    public static void main(String[] args){
        TreeNode root =new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.right=new TreeNode(7);
        root.right.left=new TreeNode(15);
        List<List<Integer>> res = new BTLevelOrder().levelOrder(root);
        res.stream().forEach(a->System.out.println(a));
    }
}
