package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {"cat", "dog", "rat", "horse", "cow", "goat"};
        Arrays.sort(arr);
        System.out.println("List of Words : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the list of word : ");
        String searchWord = scan.nextLine();
        int index = binarySearch(arr, searchWord);

        if (index == -1) {
            System.out.println("word is not present in the word List :( ");
        } else System.out.println("Word is found at index = " + index);
    }
    private static int binarySearch(String[] arr, String searchWord) {

        int start = 0, length = arr.length - 1;
        while (start <= length) {
            int middle = start + (length - start) / 2;
            int result = searchWord.compareTo(arr[middle]);
            if (result == 0)
                return middle;
            if (result > 0)
                start = middle + 1;
            else
                length = middle - 1;
        }
        return -1;
    }
}