package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] array = {"first","second","third","fourth","fifth"};
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "new Third";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		int smallest = 1000;
		int largest = 0;
		//6. make an array of 50 integers
		int [] array2 =  new int [50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < array2.length; i++) {
			array2[i] = new Random().nextInt (1000);
		}
		//8. without printing the entire array, print only the smallest number in the array
		for (int i = 0; i < array2.length; i++) {
			if (array2 [i]<smallest) {
				smallest = array2[i];
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		
		//10. print the largest number in the array.
		for (int i = 0; i < array2.length; i++) {
			if (array2[i]>largest) {
				largest = array2[i];
			}
		}
		System.out.println(largest);
	}
}
