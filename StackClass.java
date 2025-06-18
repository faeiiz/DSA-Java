
import java.util.Stack;

public class StackClass {

    public static void pushAtBottom(int data, Stack<Integer> stack) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(data, stack);
        stack.push(top);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            // stack.push(top);
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(top, stack);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        // pushAtBottom(4, s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
