import java.util.ArrayList;

public class IntStack {
    private ArrayList<Integer> intList;

    public IntStack() {
        intList = new ArrayList<>();
    }

    public int pop() {
        int temp = intList.get(intList.size() - 1);
        intList.remove(intList.size() - 1);
        return temp;
    }

    public void push(int i) {
        intList.add(i);
    }

    public boolean isEmpty() {
        if (intList.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int peek() {
        return intList.get(intList.size() - 1);
    }

    public String toString() {
        String temp = "[";
        for (int i = 0; i < intList.size(); i++) {
            if (i == intList.size() - 1) {
                temp = temp + intList.get(i);
            } else
                temp = temp + intList.get(i) + ", ";
        }
        temp = temp + "]";
        return temp;
    }
}
