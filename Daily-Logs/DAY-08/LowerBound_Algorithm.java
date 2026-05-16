package com.saileshDSA.basics;

public class LowerBound_Algorithm {
    static int lowerbound(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;

        if(key>arr[arr.length-1]){
            return -1;
        }
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid]>=key){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    static void main() {
        int[] arr = {1,2,3,5,10,11,20,20,20,25};
        int key = 15;
        int result = lowerbound(arr,key);

        if(result == -1){
            System.out.println("element out of range, no lower bound");
        }
        else{
            System.out.println("lower bound of "+key+" is "+result);
        }
    }
}
