package com.saileshDSA.basics;
public class Sentinal_LinearSearch {
    static int Sentinal_linearsearch(int[] arr,int key){
        int n = arr.length;
        int last = arr[n-1];
        arr[n-1] = key; //last element replaced with the key
        int i=0;
        while(arr[i] != key){
            i++;
        }
        arr[n-1] = last;
        if(i<n-1 || arr[i] == key){
            return i;
        }
        return -1;
    }
    static void main() {
        int[] arr = new int[]{23,8,56,34,1,9,0,2};
        int key = 2;
        int result = Sentinal_linearsearch(arr,key);
        if(result != -1){
            System.out.println("Element found at index "+result);
        }
        else{
            System.out.println("Element Not found");
        }
    }
}
