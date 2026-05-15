package com.saileshDSA.basics;

public class OrderAgnostic_BinarySearch {
    static int orderAgnostic_BinarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        boolean isAscending = false;
        if(arr[low] < arr[high]){
            isAscending = true;
        }
        while(low<=high){
            //int mid = (low+high)/2;
            int mid = low + (high - low)/2;
            if(arr[mid]==key){
                return mid;
            }
            //ascending
            if(isAscending){
                if(key > arr[mid]){
                    low = mid+1;
                }
                else if(key < arr[mid]){
                    high = mid-1;
                }
            }
            //descending
            else{
                if(key > arr[mid]){
                    high = mid-1;
                }
                else if(key < arr[mid]){
                    low = mid+1;
                }
            }
        }
        return -1;
    }
    static void main() {
        int [] arr1 = {100,90,80,70,60,50,40,30,20,10};
        int [] arr2 = {10,20,30,40,50,60,70,80,90,100};
        int key3 = 30;
        int result = orderAgnostic_BinarySearch(arr1,key3);
        int result1 = orderAgnostic_BinarySearch(arr2,key3);
        if(result1 != -1){
            System.out.println("Element found at index: "+result1);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
