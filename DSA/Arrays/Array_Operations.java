package com.saileshDSA.basics;

public class Array_Operations {
    //1. traversing array , Time Comp: O(n)
    static void traverseArray(int[] arr, int size){
        for(int i = 0; i< size; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //2. insertion at Beginning , Time Comp: O(n)
    static void insertionAtBegining(int []arr, int insertelement,int size){
        //case1 when size not given
//        int size = 0; //this the case when size is not given prior to know the size.
//        for(int num : arr){
//            if(num!=0){
//                size++;
//            }
//            else{
//                break;
//            }
//        }
//        for(int i = size; i> 0; i-- ){
//            arr[i] = arr[i-1];
//        }
//        arr[0] = insertelement;


        //case2 when size is available
        for(int i = size; i> 0; i-- ){
            arr[i] = arr[i-1];
        }
        arr[0] = insertelement;

    }

    //3. insertion at end , Time Comp: O(1)
    static void insertAtEnd(int []arr, int insertelement,int size){
//        int size = 0; //this the case when size is not given prior to know the size.
//        for(int num : arr){
//            if(num!=0){
//                size++;
//            }
//            else{
//                break;
//            }
//        }
        arr[size] = insertelement;
        size++;
    }

    //4. insert at specific position , Time Comp: O(n)
    static void insertAtSpecificPosition(int []arr, int insertelement,int position,int size){
        if(position<=0 || position>size+1){
            System.out.println("Position out of range");
        }
        else{
            for(int i = size ; i>position; i-- ){
                arr[i] = arr[i-1];
            }
            arr[position] = insertelement;
        }
    }

    //5. Deletion from the beginning, Time Comp: O(n)
    static void deletionfromBeginning(int []arr,int size){
        for(int i = 0; i<size; i++){
            arr[i] = arr[i+1];
        }
    }

    //6. Deletion At End, Time Comp: O(1)
    static void deletionAtEnd(int []arr,int size){
        arr[size-1] = 0;
    }

    //7. Deletion at specific position, Time Comp: O(n)
    static void deletionAtSpecificPosition(int []arr,int position,int size){
        if(position<=0 || position>size+1){
            System.out.println("Position out of range");
        }
        else{
            for(int i = position; i<size; i++){
                arr[i] = arr[i+1];
            }
        }
    }

    static void main() {
        int [] arr = new int[10];
        int size = 4;
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        //1. traversing array
        traverseArray(arr, size);

        //2. insertion at Beginning
        int insertelement1 = 2;
        insertionAtBegining(arr,insertelement1,size);
        size++;//5 //important, without this only up to size 4 only prints after insertion
        traverseArray(arr, size);
        int insertelement2 = 8;
        size++; //6
        insertionAtBegining(arr,insertelement2,size);
        traverseArray(arr, size);

        //3. insertion at end
        int insertelement3 = 7;
        insertAtEnd(arr,insertelement3,size);
        size++;//7  // check and debug important
        traverseArray(arr, size);

        //4. insert at specific position
        int insertelement4 = 9;
        int position = 3;
        insertAtSpecificPosition(arr,insertelement4,position,size);
        size++;
        traverseArray(arr, size);

        //5. Deletion from the beginning
        deletionfromBeginning(arr,size);
        size--;
        traverseArray(arr, size);

        //6. Deletion At End
        deletionAtEnd(arr,size);
        size--;
        traverseArray(arr, size);

        //7. Deletion at specific position
        int position2delete = 2; // 2 1 9 2 3 4 //deletes 9
        deletionAtSpecificPosition(arr,position2delete,size);
        size--;
        traverseArray(arr, size);
    }
}
