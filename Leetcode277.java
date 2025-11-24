package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Leetcode277 {
	
	public static boolean ContainsDuplicate(int nums[]) {
		Set<Integer> set = new HashSet<>();
		for(int num : nums){
		    if(set.contains(num)) {
		    	return true;
		    }
		    set.add(num);
		}
		return false;

	}

	public static void main(String args[]) {
		
		int nums[] = {1,2,3,1};
		boolean n =ContainsDuplicate(nums);
		System.out.println(n);
		
		
//		int count=0;
//		for(int i=0;i<nums.length;i++ ) {
//			 int ii = Math.abs(nums[i]);	
//			for(int j=0;j<i+1;j++) {
//				 int ij = Math.abs(nums[j]);	
//				if(ii == ij && i!=j) {
//					System.out.println("Is Contains Duplicate");
//					break;
//				}else {
//					count++;
//					System.out.println("Not Contain");
//				}
//			}
//		}
//		System.out.println("count: "+count);
//		System.out.println(nums);
		
		
	}
}
