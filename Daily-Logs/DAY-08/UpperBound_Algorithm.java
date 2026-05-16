package com.saileshDSA.basics;

public class UpperBound_Algorithm {
    static int upperbound(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        //int ub = arr.length
        if(key>arr[arr.length-1]){
            return -1;
        }
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]>key){
                //ub = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
        //return ub;
    }
    static void main() {
        int[] arr = {1,2,4,10,15,15,18,20};
        int key = 25;
        int result = upperbound(arr,key);

        if(result == -1){
            System.out.println("element out of range, no upper bound");
        }
        else{
            System.out.println("upper bound of "+key+" is "+result);
        }
    }
}
