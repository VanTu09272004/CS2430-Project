public class Main {
    static final int n = 10; // Size of the universal set
    // Complement: A'
    public boolean[] complement(boolean[] A) {
        boolean[] result = new boolean[n];
        for (int i = 0; i < n; i++) {
            result[i] = !A[i];
        }
        return result;
    }

    // Union: A ∪ B
    public boolean[] union(boolean[] A, boolean[] B) {
        boolean[] result = new boolean[n];
        for (int i = 0; i < n; i++) {
            result[i] = A[i] || B[i];
        }
        return result;
    }

    // Intersection: A ∩ B
    boolean[] intersection(boolean[] A, boolean[] B) {
        boolean[] result = new boolean[n];
        for (int i = 0; i < n; i++) {
            result[i] = A[i] && B[i];
        }
        return result;
    }

    // Difference: A - B
    boolean[] difference(boolean[] A, boolean[] B) {
        boolean[] diff = new boolean[n];
        for (int i = 0; i < n; i++) {
            diff[i] = A[i] && !B[i];
        }
        return diff;
    }

    // Symmetric difference: A ⊕ B
    boolean[] symmetricDifference(boolean[] A, boolean[] B) {
        boolean[] sym = new boolean[n];
        for (int i = 0; i < n; i++) {
            sym[i] = (A[i] && !B[i]) || (B[i] && !A[i]);
        }
        return sym;
    }

    // Helper method to convert boolean array to string representation
    public String toBitString(boolean[] set) {
        StringBuilder sb = new StringBuilder();
        for (boolean b : set) {
            sb.append(b ? "1" : "0");
        }
        return sb.toString();
    }

    // Helper method to convert boolean array to list of elements
    public String toElementList(boolean[] set, String[] U) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (int i = 0; i < n; i++) {
            if (set[i]) { // Avoid adding the last element if it's not in the set
                sb.append(U[i]).append(", ");
            }
        }
        if (sb.length() > 2) {
            sb.replace(sb.length() - 2, sb.length(), " }"); // Replace last comma with closing brace
        } else {
            sb.append("}"); // If no elements, just close the brace
        }
        return sb.toString();
    }

    public void runAllOperations(boolean[] A, boolean[] B, String[] U) {
        boolean[] complementA = complement(A);
        boolean[] complementB = complement(B);
        boolean[] union = union(A, B);
        boolean[] intersection = intersection(A, B);
        boolean[] difference = difference(A, B);
        boolean[] symmetricDifference = symmetricDifference(A, B);
        System.out.println("A: " + toBitString(A) + " -> " + toElementList(A, U));
        System.out.println(
                "NOT(A): " + toBitString(complementA) + " -> " + toElementList(complementA, U));
        System.out.println("B: " + toBitString(B) + " -> " + toElementList(B, U));
        System.out.println(
                "NOT(B): " + toBitString(complementB) + " -> " + toElementList(complementB, U));
        System.out.println(
                "A union B: " + toBitString(union) + " -> " + toElementList(union, U));
        System.out.println("A intersection B: " + toBitString(intersection) + " -> "
                + toElementList(intersection, U));
        System.out.println("A difference B: " + toBitString(difference) + " -> "
                + toElementList(difference, U));
        System.out.println("A symmetric difference B: " + toBitString(symmetricDifference) + " -> "
                + toElementList(symmetricDifference, U));
    }
}