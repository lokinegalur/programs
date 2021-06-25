import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BtreeLevel {
	public static void levelOrder(Node root) {
      if(root==null)
        return;
      Queue<Node> q = new LinkedList<>();
      q.offer(root);
      while(!q.isEmpty()){
          Node x = q.poll();
          System.out.print(x.data+" ");
          if(x.left!=null)
            q.offer(x.left);
          if(x.right!=null)
            q.offer(x.right);
      }
    }
