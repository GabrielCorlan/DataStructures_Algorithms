package bubbleSort;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1000);
        }

        System.out.println("Before sorting: ");
        printArray(arr);

//        boolean isSorted;
        for (int i = 0; i < arr.length; i++) {
//            isSorted = true;
            for (int j = 1; j < arr.length /*- i*/; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
//                    isSorted = false;
                }
            }
//            if (isSorted) break;
        }

        System.out.println("After sorting: ");
        printArray(arr);
    }

    public static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void printArray(int[] arr) {
        for (var item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
