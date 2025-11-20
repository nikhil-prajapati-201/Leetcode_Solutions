package leetcode;

import java.util.HashMap;

public class Leetcode_169 {

	public static void majorityElement(int nums[]) {
		int n = nums.length;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}else {
				map.put(nums[i], 1);
			}
		}
		
		for(int key:map.keySet()) {
			if(map.get(key)>n/3) {
				System.out.println(key);
			}
		}
	}	
		
	public static void main(String args[]) {
			int nums[] = {1,2,3,4,5,1,1,4,2,5,4,1,1,2,3,4,2,3};
			majorityElement(nums);
			
		}
		
	
}




















