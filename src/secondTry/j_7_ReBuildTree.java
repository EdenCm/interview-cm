package secondTry;

import java.util.HashMap;
import java.util.Map;

public class j_7_ReBuildTree {

    /**
     *
     * 关键是：利用前序序列根节点在前找到根节点，用根节点去中序序列划分成两部分，
     * 左部分是左子树，右部分是右子树。再利用子树长度去前序序列把前序序列中的左右
     * 子树找出来，同时可以找出根节点。递归进行此步骤，如果子树长度为0，则不需要
     * 生成子问题。
     */
    public class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private Integer value;
        public TreeNode(Integer value){
            this.value = value;
        }
    }
    // 存放inorder中节点存放的位置
    private Map<Integer,Integer> map = new HashMap<>();
    int[] treeInorder ;
    int[] treePreorder ;
    public TreeNode reBuildTree(int[] inorder,int[] preorder){
        // 判空
        // 输入合理性
        if (inorder.length != preorder.length) return null;
        treeInorder = inorder;
        treePreorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        TreeNode root = dfs(0,inorder.length-1,0,inorder.length-1);
        return root;
    }
    private TreeNode dfs(int pl,int pr,int il,int ir){

        if (pl > pr) return null;
        TreeNode node = new TreeNode(treePreorder[pl]);
        int k = map.get(treePreorder[pl]);
        node.left = dfs(pl+1,pl + k - il ,0,k-1);
        node.right = dfs(pl + k -il +1,pr,k+1,ir);
        return node;
    }
}
