import java.util.ArrayList;

public class ReverseArray {
    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40 };
        ArrayList<Integer> brr = new ArrayList<Integer>();
        int len = arr.length;
        for (int i = len - 1; i > -1; i--) {
            brr.add(arr[i]);
        }

        System.out.println("Reverse Array: " + brr);

    }
}
