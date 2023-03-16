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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer ,Integer> map = new HashMap<>();
        for(int i = 0 ; i<inorder.length ; i++){
            map.put(inorder[i] , i);
        }
        
        return ans(inorder , postorder,0 , postorder.length - 1 , 0 , inorder.length-1 ,map);
    }
    TreeNode ans(int[] inorder , int[] postorder , int postStart , int postEnd , int inStart , int inEnd , HashMap<Integer , Integer> map ){
        if(inStart > inEnd || postStart > postEnd){
            return null;
        }
        int pos = map.get(postorder[postEnd]);
        TreeNode root = new TreeNode(postorder[postEnd]);
        root.left = ans(inorder , postorder,postStart ,postStart+pos-inStart-1,inStart , pos-1 , map);
        root.right = ans(inorder , postorder,postStart +pos-inStart ,postEnd-1 , pos+1 , inEnd, map);
        return root;
    }
}
