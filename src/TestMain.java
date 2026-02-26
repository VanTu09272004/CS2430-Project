public class TestMain {

    static final int n = 10;
    
    public static void main(String[] args) {
        Ordinary ordinary = new Ordinary(); // use Main class

        String[] U = {
            "Computer Science","Mathematics","Biology","Physics",
            "Chemistry","English","History","Economics","Psychology","Art"
        };

        // Test Case 1: Partial overlap
        boolean[] A1 = new boolean[n]; A1[2]=true; A1[5]=true; A1[9]=true;
        boolean[] B1 = new boolean[n]; B1[1]=true; B1[3]=true; B1[9]=true;
        System.out.println("=== Test Case 1: Partial Overlap ===");
        ordinary.runAllOperations(A1, B1, U);

        // Test Case 2: Disjoint sets
        boolean[] A2 = new boolean[n]; A2[0]=true; A2[4]=true; A2[8]=true;
        boolean[] B2 = new boolean[n]; B2[1]=true; B2[3]=true; B2[7]=true;
        System.out.println("=== Test Case 2: Disjoint Sets ===");
        ordinary.runAllOperations(A2, B2, U);

        // Test Case 3: One empty set
        boolean[] A3 = new boolean[n];
        boolean[] B3 = new boolean[n]; B3[0]=true; B3[1]=true;
        System.out.println("=== Test Case 3: One Empty Set ===");
        ordinary.runAllOperations(A3, B3, U);

        // Test Case 4: Both sets full
        boolean[] A4 = new boolean[n]; for (int i=0;i<n;i++) A4[i]=true;
        boolean[] B4 = new boolean[n]; for (int i=0;i<n;i++) B4[i]=true;
        System.out.println("=== Test Case 4: Both Sets Full ===");
        ordinary.runAllOperations(A4, B4, U);
    }
}
