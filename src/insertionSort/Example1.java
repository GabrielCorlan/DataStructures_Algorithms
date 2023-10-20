package insertionSort;

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

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];

            int j = i - 1;

            while (j >= 0 && arr[j] > currentValue) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentValue;
        }
    }

    public static void printArray(int[] arr) {
        for (var item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
