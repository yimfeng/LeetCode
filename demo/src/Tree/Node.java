package Tree;

public class Node {
    public int val;
    public Tree.Node left;
    public Tree.Node right;
    public Tree.Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Tree.Node _left, Tree.Node _right, Tree.Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
