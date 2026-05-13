import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    static void main() {
        double[][] marks;
        marks = new double[][]{{1,2},{3,4},{5,6}};
        System.out.println(marks[0][0]);

        //initialising at runtime
        double[][] marks1 = new double[3][3];
        Scanner sc = new  Scanner(System.in);
        //input
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                marks1[i][j] = sc.nextDouble();
            }
            System.out.println();
        }
        //printing
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(marks1[i][j]+" ");
            }
            System.out.println();
        }
        //printing by using for each loop
        for(double[] element: marks1) {
            for(double x:element){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        //jagged array
        double[][] marks2 = new double[2][];
        marks2[0] = new double[3];
        marks2[1] = new double[4];
        Scanner sc1 = new Scanner(System.in);
        for(int i=0;i<marks2.length;i++) {
            for(int j=0;j< marks2[i].length;j++) {
                marks2[i][j]=sc1.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i<marks2.length;i++) { //time comp: O(n)
            for (int j = 0; j < marks2[i].length; j++) {
                System.out.print(marks2[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.deepToString(marks2));
        //printing jagged using for-each and deepToString in-built method
        for (double[] element : marks2) { //time comp: O(1)
            System.out.println(Arrays.toString(element));
        }

        //2D ARRAY Object of Students class
        Students [][]students = new Students[3][3]; //array of objects
        students[0][0] = new Students();
        students[0][0].name="sailesh";
        students[0][0].roll_no = 7;
        System.out.println(students[0][0].name+" "+students[0][0].roll_no);

        //2D jagged array  Object of Students class
//        Students [][]students = new Students[3][]; //array of objects
        students[0] = new Students[3];
        students[0][0] = new Students();
        students[0][0].name="sailesh";
        students[0][0].roll_no = 7;
        System.out.println(students[0][0].name+" "+students[0][0].roll_no);
        students[1][0] = new Students();
        students[1][0].name="balu";
        students[1][0].roll_no = 8;
        System.out.println(students[1][0].name+" "+students[1][0].roll_no);
    }
}
class Students{
    String name;
    int roll_no;
    void display(){
        System.out.println("Name: "+name +" roll_no: "+roll_no);
    }
}
