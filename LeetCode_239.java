package leetcode;

public class LeetCode_239 {
	 public int[] maxSlidingWindow(int[] nums, int k) {
	        
	        
		 int newArr[] = new int[nums.length-k+1]; ;
	        int max=0;

	        if((nums.length == 2 && k!= 2) || (nums.length == 1 && k==1) ||  k == 1 ){
	        	return nums;
	        }
	        else {
	        	
	        	for(int i=0;i<nums.length-k+1;i++) {
		        	max = max+nums[i];
		        	for(int j=i+1;j<k+i;j++) {		        	
		        		if(nums[j]>max) {
		        			max = nums[j];
		        			
		        		}
		        		newArr[i]=max;	
		        	
		        	}
		        	max = 0;	
		        }
	        }
	        return newArr;
	        
}
	 
	 public static void main(String args[]) {
		 
		 LeetCode_239 s = new LeetCode_239();
		 int[] nums = {5,3,-8};
		 int n[]= s.maxSlidingWindow(nums, 1);
		 for(int i: n) {
			 System.out.print(i+" ");
		 }
	 }
}
