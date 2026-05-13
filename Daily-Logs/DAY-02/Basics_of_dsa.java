import java.util.Arrays;

public class TimeComplexity {
    static void linearSearch() {
        int x = 5;
//        int[] arr = new int[]{10,7,-4,20,50}; // 0 milliseconds
        int[] arr = new int[5000]; //input size increses, timetaken increases
        //but here timecomplexity is same
        Arrays.fill(arr,10);
        long startTime,elapsedTime;
        startTime = System.nanoTime();
        //forloop
        for(int i = 0; i < arr.length; i++){ //O(n)
            if(arr[i] == x){
                System.out.println(arr[i]+"Element is found.");
            }
        }
//        for(int i = 0; i < 100; i++){
//            System.out.println(i);
//        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Elapsed Time: "+ elapsedTime/1000 + " milliseconds");

    }

    public static void main(String[] args) {
        linearSearch(); //calling method linearSearch

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