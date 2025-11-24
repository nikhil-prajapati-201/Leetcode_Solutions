//package leetcode;
//
//public class Leetcode389 {
//
//	String s = "a";
//	String y = "aa";
//		public char findTheDifference(String s, String t) {
//        
//        char c1[] = s.toCharArray();
//		char c2[] = t.toCharArray();
//		 for(int i=0;i<c1.length;i++) {
//			 for(int j=0;j<c2.length;j++) {
//				 if(c1[i]-c2[j] == 0) {
//					 c2[j] = '0';
//					 break;
//				 }
//			 }
//		 }
//
//		int i = 0;
//		for(int k =0;k<c2.length;k++) {
//			if(c2[k] != 0) {
//				i = k;
//			}
//		}
//
//		return c2[i];
//	} 
//		
//	public static void main(String args[]) {
//		Leetcode389 u = new Leetcode389();
//		String s = "\"ymbgaraibkfmvocpizdydugvalagaivdbfsfbepeyccqfepzvtpyxtbadkhmwmoswrcxnargtlswqemafandgkmydtimuzvjwxvlfwlhvkrgcsithaqlcvrihrwqkpjdhgfgreqoxzfvhjzojhghfwbvpfzectwwhexthbsndovxejsntmjihchaotbgcysfdaojkjldprwyrnischrgmtvjcorypvopfmegizfkvudubnejzfqffvgdoxohuinkyygbdzmshvyqyhsozwvlhevfepdvafgkqpkmcsikfyxczcovrmwqxxbnhfzcjjcpgzjjfateajnnvlbwhyppdleahgaypxidkpwmfqwqyofwdqgxhjaxvyrzupfwesmxbjszolgwqvfiozofncbohduqgiswuiyddmwlwubetyaummenkdfptjczxemryuotrrymrfdxtrebpbjtpnuhsbnovhectpjhfhahbqrfbyxggobsweefcwxpqsspyssrmdhuelkkvyjxswjwofngpwfxvknkjviiavorwyfzlnktmfwxkvwkrwdcxjfzikdyswsuxegmhtnxjraqrdchaauazfhtklxsksbhwgjphgbasfnlwqwukprgvihntsyymdrfovaszjywuqygpvjtvlsvvqbvzsmgweiayhlubnbsitvfxawhfmfiatxvqrcwjshvovxknnxnyyfexqycrlyksderlqarqhkxyaqwlwoqcribumrqjtelhwdvaiysgjlvksrfvjlcaiwrirtkkxbwgicyhvakxgdjwnwmubkiazdjkfmotglclqndqjxethoutvjchjbkoasnnfbgrnycucfpeovruguzumgmgddqwjgdvaujhyqsqtoexmnfuluaqbxoofvotvfoiexbnprrxptchmlctzgqtkivsilwgwgvpidpvasurraqfkcmxhdapjrlrnkbklwkrvoaziznlpor\"";
//				System.out.println(s);
//	}
//}
