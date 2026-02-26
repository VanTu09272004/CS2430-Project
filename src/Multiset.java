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

    public void runAllOperations(int[] A, int[] B, String[] U) {
        int[] union = union(A, B);
        int[] intersection = intersection(A, B);
        int[] difference = difference(A, B);
        int[] sum = sum(A, B);

        System.out.println("A: " + java.util.Arrays.toString(A) + " -> " + toMultisetElementList(A, U));
        System.out.println("B: " + java.util.Arrays.toString(B) + " -> " + toMultisetElementList(B, U));
        System.out.println("Multiset Union (A union B): " + java.util.Arrays.toString(union) + " -> "
                + toMultisetElementList(union, U));
        System.out.println("Multiset Intersection (A intersection B): " + java.util.Arrays.toString(intersection)
                + " -> " + toMultisetElementList(intersection, U));
        System.out.println("Multiset Difference (A difference B): " + java.util.Arrays.toString(difference) + " -> "
                + toMultisetElementList(difference, U));
        System.out.println(
                "Multiset Sum (A sum B): " + java.util.Arrays.toString(sum) + " -> " + toMultisetElementList(sum, U));
    }

    private void validate(int[] A, int[] B) {
        if (A == null || B == null) {
            throw new IllegalArgumentException("A and B must not be null.");
        }
        if (A.length != n || B.length != n) {
            throw new IllegalArgumentException("A and B must both have length " + n + ".");
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0 || B[i] < 0) {
                throw new IllegalArgumentException("Multiset counts must be non-negative.");
            }
        }
    }

    public String toMultisetElementList(int[] multiset, String[] U) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (int i = 0; i < n; i++) {
            if (multiset[i] > 0) { // Append element if count is greater than 0
                sb.append(U[i]).append(": ").append(multiset[i]).append(", ");
            }
        }
        if (sb.length() > 2) {
            sb.replace(sb.length() - 2, sb.length(), " }"); // Replace last comma with closing brace
        } else {
            sb.append("}"); // If no elements, just close the brace
        }
        return sb.toString();
    }
}
