public class Multiset {
    /*
     * Multiset operations can be implemented similarly to set operations,
     * but we need to account for the multiplicity of elements.
     * For simplicity, we can represent a multiset as an array of integers
     * where the value at each index represents the count of that element.
     */

    static final int n = 10; // Size of the universal set

    // Multiset union: A ∪ B (max count of each element)
    public int[] union(int[] A, int[] B) {
        validate(A, B);
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = Math.max(A[i], B[i]);
        }
        return result;
    }

    // Multiset intersection: A ∩ B (min count of each element)
    public int[] intersection(int[] A, int[] B) {
        validate(A, B);
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = Math.min(A[i], B[i]);
        }
        return result;
    }

    // Multiset difference: A - B (count in A minus count in B, but not less than 0)
    public int[] difference(int[] A, int[] B) {
        validate(A, B);
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = Math.max(0, A[i] - B[i]);
        }
        return result;
    }

    // Multiset sum: A + B (sum of counts of each element)
    public int[] sum(int[] A, int[] B) {
        validate(A, B);
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = A[i] + B[i];
        }
        return result;
    }

    public void runAllOperations(int[] A, int[] B) {
        int[] union = union(A, B);
        int[] intersection = intersection(A, B);
        int[] difference = difference(A, B);
        int[] sum = sum(A, B);

        System.out.println("A: " + java.util.Arrays.toString(A));
        System.out.println("B: " + java.util.Arrays.toString(B));
        System.out.println("Multiple Union (A union B): " + java.util.Arrays.toString(union));
        System.out.println("Multiple Intersection (A intersection B): " + java.util.Arrays.toString(intersection));
        System.out.println("Multiple Difference (A difference B): " + java.util.Arrays.toString(difference));
        System.out.println("Multiple Sum (A sum B): " + java.util.Arrays.toString(sum));
    }

     private void validate(int[] A, int[] B) {
        if (A == null || B == null) {
            throw new IllegalArgumentException("A and B must not be null.");
        }
        if (A.length != B.length) {
            throw new IllegalArgumentException("A and B must have the same length (same universal set).");
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0 || B[i] < 0) {
                throw new IllegalArgumentException("Multiset counts must be non-negative.");
            }
        }
    }
}
