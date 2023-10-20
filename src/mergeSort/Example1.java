package mergeSort;

import timer.StopWatch;

import java.util.Random;

public class Example1 {

    public static void main(String[] args) {
        int[] arr = new int[100000000];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100000);
        }

        StopWatch stopWatch = new StopWatch();

        System.out.println("Before sorting: ");
//        printArray(arr);
        stopWatch.start();

        mergeSort(arr);

        System.out.println("After sorting: ");
//        printArray(arr);
        stopWatch.stop();
        stopWatch.printElapsedTime();
    }

    public static void mergeSort(int[] arr) {
        int arrLen = arr.length;

        if (arrLen < 2) {
            return;
        }

        int midIndex = arrLen / 2;

        int[] leftArr = new int[midIndex];
        int[] rightArr = new int[arrLen - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftArr[i] = arr[i];
        }

        for (int i = midIndex; i < arrLen; i++) {
            rightArr[i - midIndex] = arr[i];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(arr, leftArr, rightArr);

    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;

        int leftIndex = 0, rightIndex = 0, arrIndex = 0;

        while (leftIndex < leftSize && rightIndex < rightSize) {
            if(leftArr[leftIndex] <= rightArr[rightIndex]) {
                arr[arrIndex] = leftArr[leftIndex];
                leftIndex++;
            }
            else {
                arr[arrIndex] = rightArr[rightIndex];
                rightIndex++;
            }
            arrIndex++;
        }

        while (leftIndex < leftSize) {
            arr[arrIndex] = leftArr[leftIndex];
            leftIndex++;
            arrIndex++;
        }

        while (rightIndex < rightSize) {
            arr[arrIndex] = rightArr[rightIndex];
            rightIndex++;
            arrIndex++;
        }
    }

    public static void printArray(int[] arr) {
        for (var item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
