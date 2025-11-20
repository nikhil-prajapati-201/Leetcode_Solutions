package leetcode;

public class LeetCode_1390 {

	public int sumFourDivisors(int[] nums) {
        
		int sum=0;
		boolean flag = false;
		
		for(int i=0;i<nums.length;i++) {
			int temp = 0;
            int count = 0;
			for(int k=1;k<=nums[i];k++) {
				if(nums[i]%k==0) {
					count++;
					temp+=k;	
				}
			}
			if(count == 4) {
				sum+=temp;
				temp = 0;
				count = 0;	
				flag = true;
			}
				count = 0;
				temp = 0;	
		}
		if(flag) {
			return sum;
		}
		else {
			return 0;
		}
	    }
	
	public static void main(String args[]) {
		
		LeetCode_1390 s = new LeetCode_1390();
		int nums[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(s.sumFourDivisors(nums));
	}
}
