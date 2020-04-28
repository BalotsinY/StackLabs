import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class CircusLab {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("C:\\Users\\ybalo\\Desktop\\School\\Comp Sci Projects\\Stacks\\src\\circus.txt"));

        ArrayList<Stack> groups = new ArrayList<>();

        int num = 0;
        while (scan.hasNext()) {
            int numClowns = Integer.parseInt(scan.next());
            if (numClowns != 0) {
                groups.add(new Stack<String>());
                ArrayList<String> clowns = new ArrayList();
                for (int i = 0; i < numClowns; i++) {
                    clowns.add(scan.next());
                }
                for (int i = 1; i < clowns.size(); i += 2) {
                    groups.get(num).push(clowns.get(i));
                }
                for (int i = clowns.size() - 1; i >= 0; i -= 2) {
                    if (i == clowns.size() - 1) {
                        if (clowns.size() % 2 != 0) {
                            groups.get(num).push(clowns.get(i));
                        } else {
                            i--;
                            groups.get(num).push(clowns.get(i));
                        }
                    } else {
                        groups.get(num).push(clowns.get(i));
                    }
                }
                num++;
            }
        }

        System.out.println(groups);

        num = 1;
        for (Stack s : groups) {
            System.out.println("SET " + num);
            while (!s.isEmpty()) {
                System.out.println(s.pop());
            }
            num++;
        }
    }
}
