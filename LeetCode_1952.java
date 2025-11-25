package leetcode;

public class LeetCode_1952 {

	
	 public boolean isThree(int n) {
	        int divisor = 0;
	        for(int i=1;i<=n;i++){

	            if(n%i==0){
	                divisor++;
	            }
	        }

	        if(divisor==3){
	            return true;
	        }

	            return false;
	        
	        
	    }
	
	    public static void main(String args[]) {
	    	LeetCode_1952 s = new LeetCode_1952();
	    	if(s.isThree(4)) {
	    		System.out.println("True");
	    		
	    	}else {
	    		System.out.println("False");
	    	}
	    }
}
