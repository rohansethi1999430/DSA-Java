import java.util.*;
import java.util.Scanner;

class SecondMaxIndex {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int size;
        int max = 0;
        int secondMax = 0;
        int index = 0;
        int secondMaxIndex = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the size of array: ");
        size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Your Input Array: " + arr);

        max = arr.get(0);
        for (int i = 1; i < size; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
                index = i;
            }
        }
        System.out.println("The max element from input aray is: " + max);
        System.out.println("The max element Index  is: " + index);

        for (int i = 1; i < size; i++) {
            if (arr.get(i) > secondMax && arr.get(i) < max) {
                secondMax = arr.get(i);
                secondMaxIndex = i;
            }
        }
        System.out.println("The Second max element from input aray is: " + secondMax);
        System.out.println("The Second max element Index  is: " + secondMaxIndex);

    }
}
