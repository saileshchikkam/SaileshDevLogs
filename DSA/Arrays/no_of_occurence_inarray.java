package leetcode_problems.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class no_of_occurence_inarray {
    static int occurence_inarray(int[]arr, int target, boolean findfirstposition){
        int low = 0;
        int high = arr.length-1;
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
    public static void main(String[] args) {
        int [] arr = {1,3,3,3,3,4,6,6,7,8,9};
        int target = 0;
        int first = occurence_inarray(arr,target,true);
        System.out.println(first);
        int last = occurence_inarray(arr,target,false);
        System.out.println(last);
        if(first == -1){
            System.out.println(0);
        }
        else{
            int noof_occurences = (last - first) + 1;
            System.out.println(noof_occurences);
        }
    }
}
