package com.saileshDSA.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Employee_details_jaggedarray {
    static void main() {
        //jagged array
        Scanner sc =   new Scanner(System.in);
        EmployeeDetails [][]employee =  new EmployeeDetails[2][]; // array of objects not just object of Employee class
        employee [0] =new EmployeeDetails[1];
        employee [1] = new EmployeeDetails[2];

        for(int i=0;i<employee.length;i++){
            System.out.println("Enter the employee details.");
            for(int j=0;j<employee[i].length;j++){
                System.out.println("Enter "+(j+1)+" employee details: ");
                employee [i][j] = new EmployeeDetails();
                employee [i][j].name=sc.next();
                employee [i][j].emp_id = sc.nextInt();
                employee [i][j].salary=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<employee.length;i++){
            for(int j=0;j<employee[i].length;j++){
                System.out.print(employee[i][j].name+" "+employee[i][j].emp_id+" "+employee[i][j].salary);
            }
            System.out.println();
        }
    }
}
class EmployeeDetails{
    String name;
    int emp_id;
    int salary;
}
