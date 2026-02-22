public class Main {
    static final int n = 10; // Size of the universal set

    public static void main(String[] args) {
        String[] U = { // Universal set of 10 subjects
                "Computer Science",
                "Mathematics",
                "Biology",
                "Physics",
                "Chemistry",
                "English",
                "History",
                "Economics",
                "Psychology",
                "Art"
        };
        boolean[] A = new boolean[n];
        A[2] = true;
        A[5] = true;
        A[9] = true;
        boolean[] B = new boolean[n];
        B[1] = true;
        B[3] = true;
        B[9] = true;
        Main main = new Main();
        boolean[] set = new boolean[n];
        for (int i = 0; i < n; i++) {
            set[i] = true; // Initialize the universal set (not used directly but can be useful for validation)
        }
        boolean[] complementA = main.complement(A);
        boolean[] complementB = main.complement(B);
        boolean[] union = main.union(A, B);
        boolean[] intersection = main.intersection(A, B);
        boolean[] difference = main.difference(A, B);
        boolean[] symmetricDifference = main.symmetricDifference(A, B);
        System.out.println("Universal Set U: " + main.toBitString(set) + " -> " + main.toElementList(set, U));
        System.out.println("A: " + main.toBitString(A) + " -> " + main.toElementList(A, U));
        System.out.println(
                "NOT(A): " + main.toBitString(complementA) + " -> " + main.toElementList(complementA, U));
        System.out.println("B: " + main.toBitString(B) + " -> " + main.toElementList(B, U));
        System.out.println(
                "NOT(B): " + main.toBitString(complementB) + " -> " + main.toElementList(complementB, U));
        System.out.println(
                "A union B: " + main.toBitString(union) + " -> " + main.toElementList(union, U));
        System.out.println("A intersection B: " + main.toBitString(intersection) + " -> "
                + main.toElementList(intersection, U));
        System.out.println("A difference B: " + main.toBitString(difference) + " -> "
                + main.toElementList(difference, U));
        System.out.println("A symmetric difference B: " + main.toBitString(symmetricDifference) + " -> "
                + main.toElementList(symmetricDifference, U));
    }

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
}