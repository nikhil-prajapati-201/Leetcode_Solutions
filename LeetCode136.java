package leetcode;

public class LeetCode136 {

	public static void main(String args[]) {
		int arr[]= {1,4,2,1,2};
		int a = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i] == arr[j] && !(i==j)) {

					break;
				}else {
					a = arr[j];
					
				}
			}
		}
		System.out.println(a);
	}
}
