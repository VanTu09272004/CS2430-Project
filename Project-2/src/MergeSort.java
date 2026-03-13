/*
 * Team Name: DTM
 * Team Members: Ti Nguyen, Musfer Almansoori, and Deysi Oliver
 * Course: CS 2430
 * Project: Programming Project 2
 *
 * This class implements the MergeSort algorithm.
 *
 * MergeSort works by repeatedly splitting the array into smaller
 * pieces until each piece has only one element. Then the pieces
 * are merged back together in sorted order.
 *
 * While merging, we compare elements from the left and right sides
 * to decide which one should come next in the sorted array.
 *
 * For this project we keep track of how many element comparisons
 * are made. Only comparisons between values (like a[i] <= a[j])
 * are counted, not loop conditions or index checks.
*/

public class MergeSort {

    private static long comparisons;

    public static long sort(int[] arr) {
        comparisons = 0;
        mergeSort(arr, 0, arr.length - 1);

        return comparisons;
    }

    private static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;        
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            comparisons++;

            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }
}
