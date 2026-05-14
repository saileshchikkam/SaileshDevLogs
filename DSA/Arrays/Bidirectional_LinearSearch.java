package com.saileshDSA.basics;

public class Bidirectional_LinearSearch {
    static int bidirectional_linearsearch(int[] arr,int key){
        int n = arr.length;
        int left_p = 0;
        int right_p = n-1;
        while(left_p<=right_p){
            if(arr[left_p]==key){
                return left_p;
            }
            if(arr[right_p]==key){
                return right_p;
            }
            left_p++;
            right_p--;
        }
        return -1;
    }
    static void main() {
        int[] arr = new int[]{23,8,56,34,5,1,9,0,2};
        int key = 5;
        int result = bidirectional_linearsearch(arr,key);
        if(result != -1){
            System.out.println("Element found at index "+result);
        }
        else{
            System.out.println("Element Not found");
        }
    }
}
