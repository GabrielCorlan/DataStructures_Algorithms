package quickSort;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(1000);
        }

        System.out.println("Before sorting: ");
        printArray(arr);

        sort(arr, 0, arr.length - 1);
        System.out.println("After sorting: ");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (var item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            sort(arr, low, pivotIndex - 1);
            sort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int begin, int end) {
        int pivot = arr[begin];
        int left = begin + 1;
        int right = end;

        while (true) {
            while (left <= right && arr[left] <= pivot) {
                left++;
            }

            while (left <= right && arr[right] >= pivot) {
                right--;
            }

            if (left > right) {
                break;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        int temp = arr[begin];
        arr[begin] = arr[right];
        arr[right] = temp;

        return right;
    }

    public static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
