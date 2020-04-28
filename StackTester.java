import java.util.Stack;

public class StackTester {
    private Stack<String> stack;
    public StackTester(String s) {
        stack = new Stack<String>();
        String [] temp = s.split(" ");
        for (String str : temp) {
            stack.push(str);
        }
    }

    public void popAll() {
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public String toString() {
        return ""+stack;
    }
}
