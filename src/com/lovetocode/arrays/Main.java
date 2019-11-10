package com.lovetocode.arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Arrays arrays=new Arrays();
        int n=new Scanner(System.in).nextInt();
        int arr[]=arrays.getIntegers(n);
        arr=arrays.getSortedArr(arr);
        arrays.printSortedArr(arr);

    }
}
