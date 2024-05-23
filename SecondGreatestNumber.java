// Date:- 23 May 2024
// Question: Write a program to find the second largest number in an array in Java.

import java.util.Scanner;
public class SecondGreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int size = sc.nextInt();
        int [] array = new int[size];

        System.out.println("Enter the elements in to the Array ");
        for (int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        sc.close();
        
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num < firstLargest) {
                secondLargest = num;
            }
        }
        System.out.println("The Second Largest Number is: " + secondLargest);
    }
}
