package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode179 {

	public static void main(String args[]) {
		
		int l[]= {3,30,34,5,9};
		ArrayList<Integer> ll = new ArrayList<>();
	
		for(int i=0;i<l.length;i++) {
				int last = l[i];
				ll.add(last);
		}
		String s = "";
		Collections.sort(ll);
		for(int j=ll.size()-1;j>=0;j--) {
			s = s+ ll.get(j);
		}
		
		System.out.println(s);
	}
}
