package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author: yimfeng
 * @date: 2021-02-27 4:30 下午
 * @desc:
 */
public class P232 {
    private Deque<Integer> stackPush;
    private Deque<Integer> stackPop;
    /** Initialize your data structure here. */
    public void MyQueue() {
        stackPush = new ArrayDeque<>();
        stackPop = new ArrayDeque<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackPush.addLast(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!stackPop.isEmpty()){
            return stackPop.removeLast();
        }
        while(!stackPush.isEmpty()){
            stackPop.addLast(stackPush.removeLast());
        }
        return stackPop.removeLast();
    }

    /** Get the front element. */
    public int peek() {
        if(!stackPop.isEmpty()){
            return stackPop.peekLast();
        }
        while(!stackPush.isEmpty()){
            stackPop.addLast(stackPush.peekLast());
        }
        return stackPop.peekLast();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackPop.isEmpty() && stackPush.isEmpty();
    }
}
