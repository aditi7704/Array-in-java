package Aditi;
//linear search
public class P39 {
	public static int linearSearch(int numbers[] , int key) {
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]==key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int numbers[]= {2,4,6,8,10,12,14,16};
		int key=5;
		int index=linearSearch(numbers, key);
		if(index==-1){
			System.out.println("Not found");
		}else {
			System.out.println("Element found at index:"+index);
		}
	}
}
