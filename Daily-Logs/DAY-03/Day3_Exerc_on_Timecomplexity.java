

public class Day3_Exerc_on_Timecomplexity {
    // RULES FOR TIME COMPLEXITY
    // Best Case | Average Case | Worst Case
    // Rule 1: Assignment and if statements executed once
    //         regardless of input size => O(1)
    // Rule 2: Simple loop from 0 to n => O(n)
    // Rule 3: A nested loop with same type => O(n²)
    // Rule 4: A loop in which control variable is
    //         doubled at each step => O(log n)

    // Q1 - Time: O(1), Space: O(1)
    static void q1() {
        int a = 25;              // O(1)
        int b = 10;              // O(1)
        int sum = a + b;         // O(1)
        System.out.println(sum); // O(1)
    }

    // Q2 - Time: O(n), Space: O(1) for method only
    static void addArrays(int[] arr1, int[] arr2, int[] result, int n) {
        for (int i = 0; i < n; i++) {          // O(n)
            result[i] = arr1[i] + arr2[i];     // O(1)
        }
    }

    // Q3 - Time: O(n²), Space: O(1) for method only
    static void addMatrices(int[][] A, int[][] B, int[][] result, int n) {
        for (int i = 0; i < n; i++) {                      // O(n)
            for (int j = 0; j < n; j++) {                  // O(n)
                result[i][j] = A[i][j] + B[i][j];         // O(1)
            }
        }
    }

    // Q4 - Time: O(1), Space: O(1)
    // Note: Java is pass-by-value, use array or wrapper to actually swap
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];   // O(1)
        arr[i] = arr[j];     // O(1)
        arr[j] = temp;       // O(1)
    }

    // Q5 - Time: O(n²), Space: O(1)
    static void q5(int n) {
        for (int i = 0; i < n; i++) {          // O(n)
            for (int j = 0; j <= i; j++) {     // O(n)
                System.out.println("Sachin");  // O(1)
            }
        }
    }

    // Q6 - Time: O(log₂n), Space: O(1)
    // i doubles each step: 1,2,4,8,16,32...
    static void q6(int n) {
        for (int i = 1; i <= n; i = i * 2) {  // O(log₂n)
            System.out.println("Sachin");      // O(1)
        }
    }

    // Q7 - Time: O(m+n), Space: O(1)
    static void q7(int a, int b) {
        for (int i = 0; i < a; i++) {          // O(m)
            System.out.println("Hi");          // O(1)
        }
        for (int j = 0; j < b; j++) {          // O(n)
            System.out.println("Hello");       // O(1)
        }
    }

    // Q8 - Time: O(n×m), Space: O(1)
    static void q8(int n, int m) {
        for (int i = 0; i < n; i++) {          // O(n)
            for (int j = 0; j < m; j++) {      // O(m)
                System.out.println("Hi");      // O(1)
            }
        }
    }

    // Q9 - Time: O(1), Space: O(1)
    // Generally if-else is O(1) unless it depends on input size
    static void q9() {
        int num = 10;
        if (num > 0) {                                  // O(1)
            System.out.println("positive");             // O(1)
        } else if (num < 0) {                           // O(1)
            System.out.println("negative");             // O(1)
        } else {
            System.out.println("zero");                 // O(1)
        }
    }

    // Q10 - Time: O(n), Space: O(1)
    static void q10(int num) {
        if (num > 0) {                                       // O(1)
            for (int i = 1; i <= num; i++) {                 // O(n)
                System.out.println(i);                       // O(1)
            }
        } else {
            System.out.println("num is not positive");       // O(1)
        }
    }

    // Main method to test all
    public static void main(String[] args) {
        System.out.println("=== Q1 ===");
        q1();

        System.out.println("=== Q2 ===");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] result = new int[3];
        addArrays(arr1, arr2, result, 3);
        for (int x : result) System.out.println(x);

        System.out.println("=== Q3 ===");
        int[][] A = {{1,2},{3,4}};
        int[][] B = {{5,6},{7,8}};
        int[][] res = new int[2][2];
        addMatrices(A, B, res, 2);
        for (int[] row : res)
            for (int x : row) System.out.println(x);

        System.out.println("=== Q4 ===");
        int[] arr = {10, 20};
        swap(arr, 0, 1);
        System.out.println(arr[0] + " " + arr[1]);

        System.out.println("=== Q5 ===");
        q5(3);

        System.out.println("=== Q6 ===");
        q6(16);

        System.out.println("=== Q7 ===");
        q7(3, 3);

        System.out.println("=== Q8 ===");
        q8(3, 3);

        System.out.println("=== Q9 ===");
        q9();

        System.out.println("=== Q10 ===");
        q10(5);
    }
}
