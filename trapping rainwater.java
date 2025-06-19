package Aditi;
/* Given a non negative integers representing an elevation map where the width of each bar is 1, compute how much water
it can trap after raining*/
public class P49 {
	public static int trappedRainwater(int heigth[]) {
		int n=heigth.length;
		//calculate left max boundary-array
		int leftMax[]=new int[n];
		leftMax[0]=heigth[0];
		for(int i=1; i<n; i++) {
			leftMax[i]=Math.max(heigth[i] , leftMax[i-1]);
		}
		//calculate right max boundary-array
		int rightMax[]=new int[n];
		rightMax[n-1]=heigth[n-1];
		for(int i=n-2; i>=0;i--) {
			rightMax[i]=Math.max(heigth[i] , rightMax[i+1]);
		}
		int trappedWater=0;
		//loop
		for(int i=0; i<n; i++) {
			//waterLevel=min(leftMax bound, rightMax bound);
			int waterLevel=Math.min(leftMax[i], rightMax[i]);
			//trappedWater=waterLevel-heigth[i]
			trappedWater+=waterLevel-heigth[i];
		}
		return trappedWater;
	}
	public static void main(String args[]) {
		int heigth[]= {4,2,0,6,3,2,5};
		System.out.println(trappedRainwater(heigth));
	}
}
