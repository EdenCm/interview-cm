package secondTry;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class j_32TreeLevelOrder {


    static class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private Integer value;
        public  TreeNode(Integer value){
            this.value = value;
        }
    }
    public static List<List<Integer>>  levelOrder(TreeNode root){

        List<List<Integer>> res = new LinkedList<>();
        List<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> tempList = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove(0);
                tempList.add(node.value);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(tempList);
        }
        return res;

    }

    public static void main(String[] args) {
        TreeNode root  = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left = new TreeNode(1);
        List<List<Integer>> lists = levelOrder(root);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }



}
