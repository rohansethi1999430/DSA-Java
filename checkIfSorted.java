public class checkIfSorted {

    public static void main(String[] args) {

        int arr[] = { 8, 12, 15,4};
        boolean isSorted = false;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] <= arr[i + 1]) {
                isSorted = true;
            } else {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }

}
