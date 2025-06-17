package Aditi;
//Pairs in an array
public class P44 {
	public static void printPairs(int numbers[]) {
		for(int i=0; i<numbers.length; i++) {
			int curr=numbers[i];//2,4,6,8,12
			for(int j=i+1; j<numbers.length;j++) {
				System.out.print("("+curr+","+numbers[j]+")");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		int numbers[]= {2,4,5,6,7,8};
		printPairs(numbers);
	}
}
