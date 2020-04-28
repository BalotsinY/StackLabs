import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    private Stack<Double> nums;

    public Postfix() {
        nums = new Stack<>();
    }

    public String solve(String exp) {
        Scanner temp = new Scanner(exp);
        System.out.println(exp);
        while (temp.hasNext()) {
            String test = temp.next();
            try {
                nums.push(Double.parseDouble(test));
            } catch (NumberFormatException nfe) {
                double temp1 = nums.pop();
                double temp2 = nums.pop();
                String operator = test;
                if (operator.equals("+")) {
                    nums.push(temp1 + temp2);
                } else if (operator.equals("-")) {
                    nums.push(temp1 - temp2);
                } else if (operator.equals("*")) {
                    nums.push(temp1 * temp2);
                } else if (operator.equals("/")) {
                    nums.push(temp2 / temp1);
                } else {
                    return "error";
                }
            }
        }
        return "" + nums.peek();
    }
}
