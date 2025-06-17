package Aditi;
import java.util.*;
//Smallest number in  a given array
public class P41 {
	public static int getSmallest(int numbers[]) {
		int smallest=Integer.MAX_VALUE;
		for(int i=0; i<numbers.length; i++) {
			if(smallest>numbers[i]) {
				smallest=numbers[i];
			}
		}
		return smallest;
	}
	public static void main(String args[]) {
		int numbers[]= {1,4,2,5,7};
		
		System.out.println("Smallest number is:"+ getSmallest(numbers));
	}
}
