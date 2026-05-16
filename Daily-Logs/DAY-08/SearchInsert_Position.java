package leetcode_problems.exc;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInsert_Position {
    static int searchInsert_Position(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
//        if(key>arr[arr.length-1]){
//            return -1;
//        }
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr[mid] == key){
                return mid;        //this part when array sorted and without duplicates
            }
            // if duplicates are there in array then above condition no need
            else if(arr[mid]>=key){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter 5 integers of arrays: ");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the key element: ");
        int key =  sc.nextInt();
        int result =  searchInsert_Position(arr, key);
        System.out.println(result);
        if(result != -1){
            System.out.println("it is at the index: "+result);
        }
    }
}
