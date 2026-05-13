import java.util.Arrays;
import java.util.Scanner;

public class DAY4_ArraysBasics_and_exercise {

    // ==================== ARRAY DEMO METHODS ====================

    static void arrayBasics() {
        // 1. Declaration
        int[] numbers;

        // 2. Instantiation
        numbers = new int[10];
        System.out.println("Hash code of array: " + numbers); // [I@... hashcode
        // Haven't initialised — by default they are zero

        // 3. Initialisation
        numbers = new int[]{1, 3, 4, 75, 4};
        System.out.println("Element at index 1: " + numbers[1]);
        System.out.println("Array: " + Arrays.toString(numbers));

        // All 3 steps at once
        int[] numbers1 = {1, 3, 4, 75, 4};
        System.out.println("numbers1: " + Arrays.toString(numbers1));

        // For-each loop
        int[] numbers3 = {1, 2, 3, 4, 5};
        System.out.println("For-each loop output:");
        for (int element : numbers3) {
            System.out.println(element);
        }

        // Array of objects (Student)
        Student[] students = new Student[3];
        students[0] = new Student();
        students[0].name = "sailesh";
        students[0].roll_no = 7;
        System.out.println("Student 0: " + students[0].name + " " + students[0].roll_no);

        students[1] = new Student();
        students[1].name = "pradeep";
        students[1].roll_no = 12;
        students[1].display();
    }

    // ==================== ARRAY OPERATIONS METHODS ====================

    static void max_of_array() {
        int[] arr1 = {1, 2, 3, 4, 5, 16, 7, 8, 9, 10};
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println("Max element of arr1: " + max);
    }

    static void reverse_element_ofArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    static void search_element_ofArray(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("Element " + n + " is at index: " + i);
                return;
            }
        }
        System.out.println("Element " + n + " not found in the array");
    }

    static void sum_of_element_ofArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of elements: " + sum);
    }

    // ==================== MAIN METHOD ====================

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------- Section 1: Array Basics ----------
        System.out.println("===== ARRAY BASICS =====");
        arrayBasics();

        // ---------- Section 2: Runtime Input ----------
        System.out.println("\n===== RUNTIME INPUT ARRAY =====");
        int[] numbers2 = new int[10];
        System.out.println("Enter 10 elements for numbers2:");
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = sc.nextInt();
        }
        System.out.println("numbers2: " + Arrays.toString(numbers2));

        // ---------- Section 3: Max of Array ----------
        System.out.println("\n===== MAX OF ARRAY =====");
        max_of_array();

        // ---------- Section 4: Array Reversal ----------
        System.out.println("\n===== ARRAY REVERSAL =====");
        int[] arr2 = new int[10];
        System.out.println("Enter 10 elements to reverse:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Original: " + Arrays.toString(arr2));
        reverse_element_ofArray(arr2);

        // ---------- Section 5: Search & Sum ----------
        System.out.println("\n===== SEARCH & SUM =====");
        int[] arr3 = new int[10];
        System.out.println("Enter 10 elements for search/sum:");
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = sc.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr3));
        System.out.println("Enter the element to search:");
        int n = sc.nextInt();
        search_element_ofArray(arr3, n);
        sum_of_element_ofArray(arr3);

        sc.close();
    }
}

// ==================== STUDENT CLASS ====================
class Student {
    String name;
    int roll_no;

    void display() {
        System.out.println("Name: " + name + " | Roll No: " + roll_no);
    }
}
