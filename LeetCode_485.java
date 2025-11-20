package leetcode;
/*Given a binary array numbs, return the maximum number of consecutive 1's in the array.

Example 1:

Input: numbs = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: numbs = [1,0,1,1,0,1]
Output: 2*/
public class LeetCode_485 {

   public int findMaxConsecutiveOnes(int[] nums) {
	   
	   int count=0;
	   int max;
	   
        for(int i=0;i<nums.length;i++) {
        	
        	if(nums[i] == 1) {
        		count++;
        	}
        	break;
        }
        max = count;
        count=0;
        for(int j = max+2-1; j<nums.length;j++) {
        	if(nums[j] == 1)
        		count++;        	
        	else if(nums[j]==0) {
        		if(count>=max) {
        			max = count;
        			count = 0;
        		}
        	count= 0;
        	}
        }
        return (max >count?max:count);
    }
   public static void main(String args[]) {
	   LeetCode_485 c = new LeetCode_485();
	   int nums[] = {1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1};
	   int ans = c.findMaxConsecutiveOnes(nums);
	   System.out.println("Answer: "+ans);
   }
}
