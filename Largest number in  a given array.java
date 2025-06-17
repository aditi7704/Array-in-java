package Aditi;
import java.util.*;
//Largest number in  a given array
public class P40 {
	public static int getLargest(int numbers[]) {
		int largest=Integer.MIN_VALUE;
		for(int i=0; i<numbers.length; i++) {
			if(largest<numbers[i]) {
				largest=numbers[i];
			}
		}
		return largest;
	}
	public static void main(String args[]) {
		int numbers[]= {1,4,2,5,7};
		
		System.out.println("largest number is:"+ getLargest(numbers));
	}
}
