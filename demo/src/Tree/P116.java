package Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: yimfeng
 * @date: 2021-02-04 9:36 下午
 * @desc:
 */
public class P116 {
    public static void main(String[] args) {

    }
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {
        if(root == null)
            return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            for (int i = 0; i < level; i++) {
                Node node = queue.poll();
                if(i < level-1)
                    node.next = queue.peek();
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
        }
        return root;
    }
}
