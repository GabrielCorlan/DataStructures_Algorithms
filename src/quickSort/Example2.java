package quickSort;

import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 7, 3, 2, 5};
        Random rnd = new Random();

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rnd.nextInt(10);
//        }

        System.out.println("Before sorting: ");
        printArray(arr);

        System.out.println(getPivot(arr, 0, arr.length - 1));

        sort(arr, 0, arr.length - 1);
        System.out.println("After sorting: ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (var item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = getPivot(arr, low, high);
            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    public static int getPivot(int[] arr, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;

        for (int i = pivotIndex + 1; i <= endIndex ; i++) {
            if  (arr[i] < arr[pivotIndex]) {
                swapIndex++;
                swap(arr, swapIndex, i);
            }
        }
        swap(arr, pivotIndex, swapIndex);

        return swapIndex;
    }

}
