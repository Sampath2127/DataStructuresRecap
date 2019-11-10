package com.lovetocode.arrays;

import javax.jnlp.IntegrationService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Arrays arrays=new Arrays();
        int n=new Scanner(System.in).nextInt();
        int arr[]=arrays.getIntegers(n);
        int reverseArr[]=arrays.reverseArray(arr);
        System.out.println("java.util.Arrays.toString(reverseArr) = " + java.util.Arrays.toString(reverseArr));
//        int minVal= arrays.findMinValInArr(arr);
//        System.out.println("minVal = " + minVal);
//        arr=arrays.getSortedArr(arr);
//        arrays.printSortedArr(arr);

    }


}
