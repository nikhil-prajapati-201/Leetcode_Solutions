package leetcode;

public class LeetCode_66 {
	
		public int[] onePlus(int[] digits) {
			
		for(int i = digits.length-1;i>=0;i--){
	        
			if(digits[i] < 9){
	            digits[i]++;
	            return digits;   
	        }
			
	        digits[i]=0;
	       }
		
	       digits = new int[digits.length+1];
	       digits[0]=1;
	       return digits;
	}	
		public static void main(String args[]){
			
			int arr[]= {9,8,7,6,5,4,3,2,1,0};
			LeetCode_66 s = new LeetCode_66();
			int []newArr = s.onePlus(arr);
			
			for(int i:newArr) {
				System.out.print(i+" ");
			}
	}

	}

