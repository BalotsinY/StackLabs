public class FirstStack {
    public static void main(String[] args) {
        StackTester test = new StackTester("a b c d e f g h i");
        System.out.println(test);
        test.popAll();
    }
}
