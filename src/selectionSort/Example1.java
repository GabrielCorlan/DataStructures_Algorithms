package selectionSort;

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

        sort(arr);
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

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min = arr[i];
            int indexOfMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexOfMin = j;
                }
            }
            swap(arr, i, indexOfMin);
        }
    }
}
