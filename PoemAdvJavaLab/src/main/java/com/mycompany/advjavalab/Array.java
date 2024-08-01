package com.mycompany.advjavalab;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        
        System.out.println("Enter no. of elements in 1D array:");
        int n=scan.nextInt();
        int[] arr1D=new int[n];
        System.out.println("Enter elements of 1D array:");
        for(int i=0;i<n;i++){
            arr1D[i]=scan.nextInt();
        }
        System.out.println("1D array:");
        for(int i=0;i<arr1D.length;i++){
            System.out.print(arr1D[i]+" ");
        }
        
        System.out.println("\nEnter no of rows in multiD array:");
        int rows=scan.nextInt();
        System.out.println("Enter no of columns in multiD array");
        int cols=scan.nextInt();
        int[][] arrMD=new int[rows][cols];
        System.out.println("Enter element of multiD array:");
        for(int i=0;i<rows;i++){
            System.out.println("Enter "+cols+" elements of "+(i+1)+"th row");
                for(int j=0;j<cols;j++){
                    arrMD[i][j]=scan.nextInt();
                }
        }
        
        System.out.println("Elements of multidimensional array:");
        for(int[] x:arrMD){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        
    }
   
}
