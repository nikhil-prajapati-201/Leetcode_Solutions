package leetcode;

public class LeetCode_125 {
	
	    public boolean isPalindrome(String s) {
	   
	        
	        StringBuilder duplicate = new StringBuilder();
	        
	        for(int i=0;i<s.length();i++){
	            if(Character.isLetterOrDigit(s.charAt(i))){
	            	
	                duplicate.append(Character.toLowerCase(s.charAt(i)));
	            }
	        }
	       
	        String str =duplicate.toString();
	        
	        for(int i=0;i<str.length()/2;i++) {
	        	if(str.charAt(i) == str.charAt(str.length()- i-1)) {
	        		
	        	}else
	        		return false;
	        }
	        return true;
	        
	        
	        
	    }
	    
	    public static void main(String args[]){
	        
	        LeetCode_125 s = new LeetCode_125();
	    
	        if(s.isPalindrome("nikhil")) {
	        	System.out.println("Pallindrome");
	        }else {
	        	System.out.println("Not-Palindrome");
	        }
	    
	}
}
