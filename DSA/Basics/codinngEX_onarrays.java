package com.saileshDSA.basics;

import java.util.Arrays;
import java.util.Scanner;

public class codinngEX_onarrays {
    static void max_of_array(){
        int [] arr1 =  {1,2,3,4,5,16,7,8,9,10};
        int max = arr1[0];
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] > max){
                max = arr1[i];
            }
        }
        System.out.println("Max element of arr1: "+max);
    }
    static void reverse_element_ofArray(int[] arr2){
        int left = 0;
        int right = arr2.length-1;
        while(left<right){
            int temp =  arr2[left];
            arr2[left] = arr2[right];
            arr2[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed array: "+Arrays.toString(arr2));
    }
    static void search_element_ofArray(int[] arr3,int n){
        for(int i = 0; i < arr3.length; i++){
            if(arr3[i] == n){
                System.out.println("Element "+n+" is at the index: "+i);
                return; // method stops here
            }
        }
        System.out.println("Element "+n+" is not found in the array");
    }
    static void sum_of_element_ofArray(int[] arr2){
        int sum = 0;
        for(int i = 0; i < arr2.length; i++){
            sum += arr2[i];
        }
        System.out.println("Sum of element of array is "+sum);
    }
    static void main() {
        // max of array
        max_of_array();

        // array reversal
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of array to reverse it: ");
        int []arr2 = new int[10];
        for(int i = 0; i< arr2.length; i++ ){
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr2));
        reverse_element_ofArray(arr2);

        // searching specific element in the array
        int [] arr3 = new int[10];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i< arr3.length; i++ ){
            arr3[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("Enter the element of array to search it: ");
        int n = sc.nextInt();
        search_element_ofArray(arr3,n);

        //sum of array
        sum_of_element_ofArray(arr3);
    }
}
