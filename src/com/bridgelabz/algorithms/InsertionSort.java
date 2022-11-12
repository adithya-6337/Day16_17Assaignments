package com.bridgelabz.algorithms;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        String[] arr = {"tiger", "Dog", "cat", "cow", "goat", "lion"};
        System.out.println("Before Insertion Sort :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("\nAfter insertion Sort :");
        String[] sortedArray = insertionSort.sort(arr);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i] + " ");
        }
    }

    String[] sort(String[] array) {
        String temp = " ";
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
