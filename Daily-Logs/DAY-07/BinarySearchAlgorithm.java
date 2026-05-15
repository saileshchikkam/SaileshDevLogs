package com.saileshDSA.basics;

import java.util.Arrays;

public class BinarySearchAlgorithm {
//=====================Accenting ordered array binary search==============================
    // return type int
//    static int binarySearch(int[] arr,int n, int key){
//        int low = 0;
//        int high = n-1;
//        while(low<=high){
//        //int mid = (low+high)/2;
//            int mid = low + (high - low)/2;
//            if(arr[mid]==key){
//                return mid;
//            }
//            else if(key < arr[mid]){
//                high = mid-1;
//            }
//            else{
//                low = mid+1;
//            }
//        }
//        return -1;
//    }
//    static void main() {
//        int []arr = {105,8,-1,11,5};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int key1 = 8;
//        int n = arr.length;
//        int result = binarySearch(arr,n,key1);
//        if(result != -1){
//            System.out.println("Element found at index: "+result);
//        }
//        else{
//            System.out.println("Element not found");
//        }
//    }

    // return type void
//    static void binarySearch_ascending(int[] arr,int n, int key){
//        int low = 0;
//        int high = n-1;
//
//        while(low<=high){
//            //int mid = (low+high)/2;
//            int mid = low + (high - low)/2;
//
//            if(arr[mid]==key){
//                System.out.println("Element found at index: "+mid);
//                return;
//            }
//            else if(key < arr[mid]){
//                high = mid-1;
//            }
//            else{
//                low = mid+1;
//            }
//        }
//        System.out.println("Element not found");
//    }

//=====================descending ordered array binary search==============================

    static void binarySearch_descending(int[] arr,int n,int key){
        int low = 0;
        int high = n-1;

        while(low<=high){
            //int mid = (low+high)/2;
            int mid = low + (high - low)/2;

            if(arr[mid]==key){
                System.out.println("Element found at index: "+mid);
                return;
            }
            else if(key > arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println("Element not found");
    }

    static void main() {
        //ascending order
//
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        int key1 = 100;
//        int n = arr.length;
//        binarySearch_ascending(arr,n,key1);

        //descending order
        int []arr1 = {100,90,80,70,60,50,40,30,20,10};
        System.out.println(Arrays.toString(arr1));
        int n1 = arr1.length;
        int key2 = 30;
        binarySearch_descending(arr1,n1,key2);
    }

}
