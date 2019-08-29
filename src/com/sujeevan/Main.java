package com.sujeevan;
import java.util.Scanner;

public class Main {
public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
	int[] intArray = getintegers(5);
	int[] sorted = sortedArray(intArray);
	printArray(sorted);
    }

    public static int[] getintegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values " + "\r");
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println("Element " + i + " is " + array[i]);
        }
    }

    public static int[] sortedArray(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i=0;i<sortedArray.length;i++){
            sortedArray[i]=array[i];
        }

        for (int j=0;j<sortedArray.length-1;j++){
            int temp;
            if (sortedArray[j]<sortedArray[j+1]){
                temp=sortedArray[j];
                sortedArray[j]=sortedArray[j+1];
                sortedArray[j+1]=temp;
            }
        }
        return sortedArray;
    }
}
