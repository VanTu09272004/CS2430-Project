public class TestMultiset {
    /*
     * Team name: DTM
     * Team members (Ti Nguyen, Musfer Almansoori, and Deysi Oliver)
     * Course and section (CS 2430, section 1)
     * Project name (Programming Project 1 – Spring 2026)
     * 
     */
    static final int n = 10;

    public static void main(String[] args) {

        Multiset multiset = new Multiset();

        String[] U = {
                "Computer Science", "Mathematics", "Biology", "Physics",
                "Chemistry", "English", "History", "Economics", "Psychology", "Art"
        };

        // Test Case 1: Partial Overlap
        int[] A1 = new int[n];
        int[] B1 = new int[n];

        A1[2] = 2; // Biology x2
        A1[5] = 1; // English x1
        A1[9] = 3; // Art x3

        B1[2] = 1; // Biology x1
        B1[3] = 4; // Physics x4
        B1[9] = 2; // Art x2

        System.out.println("=== Test Case 1: Partial Overlap ===");
        multiset.runAllOperations(A1, B1, U);

        // Test Case 2: Disjoint
        int[] A2 = new int[n];
        int[] B2 = new int[n];

        A2[0] = 1;
        A2[4] = 2;

        B2[6] = 3;
        B2[8] = 1;

        System.out.println("\n=== Test Case 2: Disjoint ===");
        multiset.runAllOperations(A2, B2, U);

        // Test Case 3: One Empty
        int[] A3 = new int[n];
        int[] B3 = new int[n];

        B3[1] = 2;
        B3[7] = 5;

        System.out.println("\n=== Test Case 3: One Empty ===");
        multiset.runAllOperations(A3, B3, U);

        // Test Case 4: Both Full
        int[] A4 = new int[n];
        int[] B4 = new int[n];

        for (int i = 0; i < n; i++) {
            A4[i] = 2;
            B4[i] = 3;
        }

        System.out.println("\n=== Test Case 4: Both Full ===");
        multiset.runAllOperations(A4, B4, U);

        // Test Case 5: Invalid Input
        System.out.println("\n=== Test Case 5: Invalid Input (Should Throw Exception) ===");

        try {
            int[] A5 = new int[n];
            int[] B5 = new int[n];

            A5[2] = -1; // Invalid negative count

            multiset.runAllOperations(A5, B5, U);

        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught successfully: " + e.getMessage());
        }
    }
}
