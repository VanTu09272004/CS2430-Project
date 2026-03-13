/*
 * Team Name: DTM
 * Team Members: Ti Nguyen, Musfer Almansoori, and Deysi Oliver
 * Course: CS 2430
 * Project: Programming Project 2
 *
 * This class generates all permutations of the numbers 0 through n-1.
 * A permutation is just a different ordering of the same elements.
 *
 * Example for n = 3:
 * [0,1,2], [0,2,1], [1,0,2], [1,2,0], [2,0,1], [2,1,0]
 *
 * The algorithm works by swapping elements and using recursion
 * to build all possible orderings of the array. Every time the
 * recursion reaches the end of the array, we store that arrangement
 * as one valid permutation.
 */

import java.util.ArrayList;
import java.util.List;

public class PermutationGenerator {

    public static List<int[]> generatePermutations(int n) {

        List<int[]> permutations = new ArrayList<>();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        permute(arr, 0, permutations);
        
        return permutations;
    }

    private static void permute(int[] arr, int index, List<int[]> result) {

        if (index == arr.length) {
            result.add(arr.clone());
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            permute(arr, index + 1, result);
            swap(arr, index, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
