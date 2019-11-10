package com.lovetocode.arrays;

import java.util.Scanner;

public class Arrays {

    private static final Scanner scr=new Scanner(System.in);

    public int[] getIntegers(int n) {
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scr.nextInt();
        }
        return arr;
    }

    public int[] getSortedArr(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int index=i;
            int maxVal=arr[i];
            for (int j=i+1; j<arr.length; j++){
                if(maxVal<arr[j]){
                    maxVal=arr[j];
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=maxVal;
            arr[index]=temp;
        }
        return arr;
    }

    public void printSortedArr(int[] arr) {
        for (int i : arr
             ) {
            System.out.print(i+" ");
        }
        
    }
}

