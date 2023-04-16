import java.util.*;
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int size;
        int max = 0;
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the size of array: ");
        size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter the Integer: ");
            arr.add(sc.nextInt());
        }
        System.out.println("Your Input Array: " + arr);

        System.out.println("Calculating the max element from input aray: -------");
        max = arr.get(0);
        for (int i = 1; i < size; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
                index = i;
            }
        }
        System.out.println("The max element from input aray is: " + max);
        System.out.println("The max element from input aray is: " + index);

    }
}
