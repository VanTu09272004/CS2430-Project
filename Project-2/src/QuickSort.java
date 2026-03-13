/*
 * Team Name: DTM
 * Team Members: Ti Nguyen, Musfer Almansoori, and Deysi Oliver
 * Course: CS 2430
 * Project: Programming Project 2
 *
 * This class implements the QuickSort algorithm.
 *
 * QuickSort works by choosing a pivot value and rearranging the
 * array so that smaller values come before the pivot and larger
 * values come after it. This process is called partitioning.
 *
 * After the partition step, the algorithm recursively sorts the
 * left and right sides of the array.
 *
 * In this implementation we use the last element as the pivot.
 * We also keep track of the number of comparisons between elements.
 */

public class QuickSort {

    private static long comparisons;

    public static long sort(int[] arr) {

        comparisons = 0;
        quickSort(arr, 0, arr.length - 1);

        return comparisons;
    }

    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            comparisons++;

            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
