package leetcode;

public class LeetCode35 {

	public static void main(String args[]) {
		int arr[] = {1,3,5,6};
		int target = 2;
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(target == arr[i]) {
				count = i;
			}else {
				if((arr[i] < target) && !(arr[i] > target)) {
					count++;
				}
				
			}
		}
		
		System.out.println(count);
	}
}
