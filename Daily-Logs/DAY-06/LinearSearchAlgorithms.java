package com.saileshDSA.basics;
import java.util.Arrays;
public class LinearSearchAlgorithms {
    static int LinearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    static int TranspositionLinerSearch(int[] arr, int key1){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key1){
                System.out.println("element found at position " + i);
                if(i>0){
                    int temp = arr[i]; //temp = 5
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    return i-1;
                }
                return 1;
            }
        }
        return -1;
    }
    static int foundelement_movetofront(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                int index = i;
                System.out.println("element found at position " + i);
                if(i>0){
                    int temp = arr[i];
                    arr[i] = arr[0];
                    arr[0] = temp;
                }
                return index;
            }
        }
        return -1;
    }
    static void main() {
        //LINEAR SEARCH NORMAL
        int[] arr = new int[]{23,7,4,5,866,224,3};
        int key = 866;
        int result = LinearSearch(arr,key);
        if(result != -1){
            System.out.println("Element found at index "+result);
        }
        else{
            System.out.println("Element Not found");
        }

        // TRANSPOSITIONAL LINEAR SEARCH
        int key1 = 5;
        int result1 = TranspositionLinerSearch(arr, key1);
        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
        if(result1 != -1){
            System.out.println("Element found at index "+result1);
        }
        else{
            System.out.println("Element Not found");
        }

        // MOVE TO FRONT LINEAR SEARCH
        int key3 = 5;
        int result3 = foundelement_movetofront(arr, key3);
        System.out.println(Arrays.toString(arr));
        if(result3 != -1){
            System.out.println("Element found at index "+result3);
        }
        else{
            System.out.println("Element Not found");
        }
    }
}
