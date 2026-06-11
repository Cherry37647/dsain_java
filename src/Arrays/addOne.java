package Arrays;

import java.util.ArrayList;

public class addOne {

    ArrayList<Integer> addone() {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(9);
        arr.add(7);
        arr.add(7);
        arr.add(9);

        int carry = 1;

        for (int i = arr.size() - 1; i >= 0; i--) {

            int sum = arr.get(i) + carry;

            arr.set(i, sum % 10);

            carry = sum / 10;

            if (carry == 0)
                break;
        }

        if (carry == 1) {
            arr.add(0, 1); // insert 1 at beginning
        }

        return arr;
    }

    public static void main(String[] args) {

        addOne obj = new addOne();

        System.out.println(obj.addone());
    }
}