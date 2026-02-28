public class Ordinary {
    /*
     * Team members (Ti Nguyen, Musfer Almansoori, and Deysi Oliver)
     * Course and section (CS 2430, section 1)
     * Project name (Programming Project 1 – Spring 2026)
     * 
     * This class implements ordinary set operations on boolean arrays.
     * Each index in the array represents an element in the universal set,
     * and the value at that index (true/false) indicates whether that element is in
     * the set.
     * The universal set is assumed to have a fixed size (n = 10 in this case).
     */
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
    public String toOrdinaryElementList(boolean[] set, String[] U) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (int i = 0; i < n; i++) {
            if (set[i]) { // Append elements separated by comma; remove trailing comma at end
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
        if (U.length != n) {
            throw new IllegalArgumentException("Universal set size must be " + n);
        }
        boolean[] complementA = complement(A);
        boolean[] complementB = complement(B);
        boolean[] union = union(A, B);
        boolean[] intersection = intersection(A, B);
        boolean[] difference = difference(A, B);
        boolean[] symmetricDifference = symmetricDifference(A, B);
        System.out.println("A: " + toBitString(A) + " -> " + toOrdinaryElementList(A, U));
        System.out.println(
                "NOT(A): " + toBitString(complementA) + " -> " + toOrdinaryElementList(complementA, U));
        System.out.println("B: " + toBitString(B) + " -> " + toOrdinaryElementList(B, U));
        System.out.println(
                "NOT(B): " + toBitString(complementB) + " -> " + toOrdinaryElementList(complementB, U));
        System.out.println(
                "A union B: " + toBitString(union) + " -> " + toOrdinaryElementList(union, U));
        System.out.println("A intersection B: " + toBitString(intersection) + " -> "
                + toOrdinaryElementList(intersection, U));
        System.out.println("A difference B: " + toBitString(difference) + " -> "
                + toOrdinaryElementList(difference, U));
        System.out.println("A symmetric difference B: " + toBitString(symmetricDifference) + " -> "
                + toOrdinaryElementList(symmetricDifference, U));
    }
}