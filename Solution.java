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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> mainList = new ArrayList<List<Integer>>();  //list of list
        if(root==null)
            return mainList;
         
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int looper = 1;
        List<Integer> xx = new ArrayList<>();
        xx.add(root.val);
        mainList.add(xx);
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList<>();   // list for current level
            int i=0,temp=0;
            while(i++<looper){
                TreeNode x = q.poll();
                if(x.left!=null){
                    q.offer(x.left);
                    temp++;
                    l.add(x.left.val);
                }
                if(x.right!=null){
                    q.offer(x.right);
                    temp++;
                    l.add(x.right.val);
                }
            }
            if(temp>0)
              mainList.add(0,l);
            looper=temp;
        }
        return mainList;
    }
}