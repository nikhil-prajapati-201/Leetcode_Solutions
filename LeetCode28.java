package leetcode;

public class LeetCode28 {

	public static void main(String args[]) {
		
		String hystack = "leetcode";
		String needel = "leeto";
		
		StringBuilder sb = new StringBuilder(hystack);
		int output = sb.indexOf(needel);
		
		System.out.println(output);
	}
}
