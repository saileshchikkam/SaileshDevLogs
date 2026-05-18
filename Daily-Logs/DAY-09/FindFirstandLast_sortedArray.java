package leetcode_problems.exercises;

import java.util.Arrays;

public class FindFirstandLast_sortedArray {
//    static int firstoccurence(int[] arr, int target) {
//        int low =  0;
//        int high = arr.length - 1;
//        int first = -1;
//        while (low <= high) {
//            int mid = low + (high - low)/2;
//            if(arr[mid] == target){
//                first = mid;
//                high = mid-1;
//            }
//            else if(arr[mid] > target){
//                high = mid-1;
//            }
//            else{
//                low = mid+1;
//            }
//        }
//        return first;
//    }
//    static int lastoccurence(int[] arr, int target) {
//        int low =  0;
//        int high = arr.length - 1;
//        int last = -1;
//        while (low <= high) {
//            int mid = low + (high - low)/2;
//            if(arr[mid] == target){
//                last = mid;
//                low = mid+1;
//            }
//            else if(arr[mid] > target){
//                high = mid-1;
//            }
//            else{
//                low = mid+1;
//            }
//        }
//        return last;
//    }
    // 2nd approach
//    static int lowerbound(int []arr,int target){
//        int low = 0;
//        int high = arr.length-1;
//        int lb = -1; //not arr.length;
//        while(low<=high){
//            int mid = low +(high-low)/2;
//            if (arr[mid] >= target){
//                lb = mid;
//                high = mid-1;
//            }
//            else{
//                low = mid+1;
//            }
//        }
//        return lb;
//    }
//    static int upperbound (int []arr,int target){
//        int low = 0;
//        int high = arr.length-1;
//        int ub = arr.length; // not -1;
//        while(low<=high){
//            int mid = low +(high-low)/2;
//            if (arr[mid] > target){
//                ub = mid;
//                high = mid-1;
//            }
//            else{
//                low = mid+1;
//            }
//        }
//        return ub;
//    }
//    static int[] firstandlastoccurence(int [] arr, int target){
//        int[] result = {-1,-1};
//        int lb = lowerbound(arr,target);
//        if(lb == arr.length || arr[lb] != target){
//            return result;
//        }
//        return new int[]{lb, upperbound(arr,target) - 1};
//    }
    //3 optimal approach
    static int searchposition(int[] arr, int target, boolean findfirstposition){
        int low = 0;
        int high = arr.length;
        int pos = -1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if (arr[mid] > target){
                high = mid-1;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                pos = mid;
                if(findfirstposition){
                    high =  mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }
        return pos;
    }
    static int[] firstandlastoccurence(int [] arr, int target){
        int[] result = {-1,-1};
        int first = searchposition(arr, target, true);
        int last = searchposition(arr, target, false);
        if (first == -1) {
            return result;
        }
        return new int[]{first, last};
    }

    static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10};
        int target = 8;
//        int[] result3 = firstandlastoccurence(arr,target);
//        System.out.println(Arrays.toString(result3));
        System.out.println(Arrays.toString(firstandlastoccurence(arr, target)));

    }
}
