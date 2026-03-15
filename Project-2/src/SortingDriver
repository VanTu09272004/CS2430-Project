import java.util.List;
import java.util.Arrays;

public class SortingDriver {

    public static void main(String[] args) {

        int n = 3; // test value

        List<int[]> permutations = PermutationGenerator.generatePermutations(n);

        System.out.println("Total permutations: " + permutations.size());
        System.out.println();

        for (int[] perm : permutations) {

            int[] mergeArray = perm.clone();
            int[] quickArray = perm.clone();

            long mergeComparisons = MergeSort.sort(mergeArray);
            long quickComparisons = QuickSort.sort(quickArray);

            System.out.println("Original: " + Arrays.toString(perm));

            System.out.println("MergeSort Result: " + Arrays.toString(mergeArray) +
                    " | Comparisons: " + mergeComparisons);

            System.out.println("QuickSort Result: " + Arrays.toString(quickArray) +
                    " | Comparisons: " + quickComparisons);

            System.out.println();
        }
    }
}
