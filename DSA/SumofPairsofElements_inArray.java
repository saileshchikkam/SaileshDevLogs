package com.saileshDSA.basics;

public class SumofPairsofElements_inArray {
    static void main() {
        int [] arr = new int []{10,4,5,-1,7};
        int sum = 0;
        for(int i=0;i< arr.length;i++) {
            for(int j=i+1;j< arr.length;j++) { //timecomp: O(n^2)
                sum = arr[i]+arr[j];
                System.out.println(sum);
            }
        }
    }
}
