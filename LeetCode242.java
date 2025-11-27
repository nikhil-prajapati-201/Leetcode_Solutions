package leetcode;

import java.util.Arrays;

public class LeetCode242 {

	public static void main(String args[]) {
		//String is Anagram or Not
		
		String s = "a";
		String t = "ab";
		
		char []c = s.toCharArray();
		char tt[] = t.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(tt);
		
		if(c.length != tt.length) {
			System.out.println("IsNotAnagram");
		}
		
		String s1 = "";
		String s2 = "";
		
		for(int i = 0;i<s.length();i++) {
			char ch1 = c[i];
			char ch2 = tt[i];
			s1 = s1+ ch1;
			s2 = s2+ ch2;
		}
		
		
		if(s1.equals(s2) ) {
			System.out.println("isAnagram");
		}else {
			System.out.println("isNot-Anagram");
		}
		
	}

	
}
