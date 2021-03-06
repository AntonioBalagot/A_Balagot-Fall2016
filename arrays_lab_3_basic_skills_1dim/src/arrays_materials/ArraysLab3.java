//Antonio Balagot APCS1
//   11/5/16
//5 methods that are used to manipulate elements of an array(add to, append, remove, or rotate), 
//along with a main method to call the other 5 methods. 

package arrays_materials;

import java.util.Arrays;

public class ArraysLab3 {
	
	//Method called sum used to add the elements at the same index for the arrays arr1 and arr2.
	public static int[] sum(int[] arr1, int[] arr2) {
		assert (arr1.length > 0);
		assert (arr2.length > 0);
		assert (arr1.length == arr2.length);
		int[] sum = new int[arr1.length];
		for(int i = 0; i <= sum.length - 1; i++){
			sum[i] = arr1[i] + arr2[i];
		}
		return sum;
	}
	
	//Method called append used to return an array of integers of length n+1 
	//that consists of the elements of arr with num appended to the end.
	public static int[] append(int[] arr, int num) {
		assert (arr.length > 0);
		int[] newArr = new int [arr.length + 1];
		for(int i = 0; i < arr.length; i++){
			newArr[i] = arr[i];
		}
		newArr[arr.length] = num;
		return(newArr);
	}
	
	//Method called remove used to return an array of integers consisting of 
	//all of the elements of arr, except for the element at index idx
	public static int[] remove(int[] arr, int idx) {
		assert (arr.length >= 2);
		int[] newArr = new int[arr.length - 1];
		for(int i = 0; i < idx; i++){
			newArr[i] = arr[i];
		}
		for(int i=idx; i<newArr.length;i++){
			newArr[i] = arr[i+1];
		}
		return(newArr);
	}
	
	//Method called sumEven used to add together the elements at the even indices of arr
	public static int sumEven(int[] arr) {
		assert (arr.length > 0);
		int evenSum = 0;
		for(int i=0; i < arr.length; i++) {
			if(i % 2 == 0){
				evenSum = evenSum + arr[i];
			}
		}
		return(evenSum);
	}
	
	//Method called rotateRight used to shift each element of arr one index to the right
	public static void rotateRight(int[] arr) {
		assert (arr.length > 0);
		int lastcell = arr[arr.length - 1];
		for(int i = arr.length - 1; i>=1; i--){
			arr[i] = arr[i-1];
		}
		arr[0] = lastcell;
	}

	//Main method to declare each of the methods and print their contents
	public static void main(String[] args) {
		int[] a1 = {5, 10, 15, 20, 25, 30, 35 ,40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		int[] sumArr = sum(a1, a2);
		int appendNum = 200;
		int[] appendArr = append(a1, appendNum);
		int removeIdx = 5;
		int[] removeArr = remove(a2, removeIdx);
		int sumOfEvens = sumEven(appendArr);
		rotateRight(a1);
		
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
	}
}