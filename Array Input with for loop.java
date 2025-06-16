package Aditi;
import java.util.*;
//Array Input with for loop
public class P35 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		//Taking input
		System.out.println("Enter 5 Elements:");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}
}
