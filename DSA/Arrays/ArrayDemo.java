package com.saileshDSA.basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    static void main() {
        int [] numbers;  // 1.declaration
        numbers = new int[10]; // 2.instantiation
        System.out.println(numbers); //[I@27716f4 hashcode
        // here we haven't initialised by default they are zero
        numbers = new int[] {1,3,4,75,4}; // 3.intialisation
        System.out.println(numbers[1]);
        System.out.println(Arrays.toString(numbers));

        // 3 steps at a time
        int [] numbers1 = {1,3,4,75,4};
        System.out.println(Arrays.toString(numbers1));
        // beyond arrray size there will be array index out of bound

        //to initialise at runtime
        Scanner sc = new Scanner(System.in);
        int [] numbers2 = new int[10];
        for(int i = 0; i < numbers2.length; i++) {
            numbers2[i] = sc.nextInt(); //time complexity is O(n).
        }                               //space complexity is O(1)
        System.out.println(Arrays.toString(numbers2));

        //for-each loop
        int [] numbers3 = {1,2,3,4,5};
        for(int element : numbers3) {
            System.out.println(element);
        }

        // object of Student class
        Student []students = new Student[3]; //array of objects
        students[0] = new Student();
        students[0].name="sailesh";
        students[0].roll_no = 7;
        System.out.println(students[0].name+students[0].roll_no);
        students[1] = new Student();
        students[1].name = "pradeep";
    }
}
class Student{
    String name;
    int roll_no;
    void display(){
        System.out.println("Name: "+name +" roll_no: "+roll_no);
    }
}
