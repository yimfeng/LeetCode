package Tree;

import java.util.LinkedList;
import java.util.Queue;
public class P117 {
    public static void main(String[] args) {

    }
    public Node connect(Node root) {
        if(root == null)
            return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        root.next = null;
        while(!queue.isEmpty()){
            int level = queue.size();
            Node first = queue.poll();
            for(int i=0; i<level - 1; i++){
                Node node = queue.poll();
                first.next = node;
                first = node;
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                if(i == level -1)
                    node.next = null;
            }
        }
        return root;
    }
}
