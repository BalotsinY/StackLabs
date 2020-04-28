import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PostfixRunner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("C:\\Users\\ybalo\\Desktop\\School\\Comp Sci Projects\\Stacks\\src\\postfix.txt"));
        Postfix postfix = new Postfix();
        while (scan.hasNext()) {
            System.out.println(postfix.solve(scan.nextLine()));
        }
    }
}
