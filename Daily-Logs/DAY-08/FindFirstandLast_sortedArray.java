package leetcode_problems.exc;

import java.util.Arrays;

public class FindFirstandLast_sortedArray {
    static int[] findfirstandlast(int[] arr, int target) {
        int low =  0;
        int high = arr.length - 1;
        int lb = arr.length;
        int ub = arr.length;
        while (low <= high) {
            int mid = low + (high - low)/2;

            if(arr[mid]>=target){
                lb = mid;
                high = mid-1;
            }
            else if(arr[mid]<=target){
                low = mid+1;
            }

            else if(arr[mid]>target){
                ub = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return new int[]{lb,ub};
    }
    static void main() {
        int [] arr = {5,7,7,8,8,10};
        int target = 6;
        int[] result = findfirstandlast(arr,target);
        System.out.println(Arrays.toString(result));
    }
}
