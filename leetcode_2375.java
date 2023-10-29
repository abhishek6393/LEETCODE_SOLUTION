 package stacks;
 import java.util.*;;

public class leetcode_2375 {

	public static void main(String[] args) {
		String pattern = "IIIDIDDD";
		System.out.println(small(pattern));

		// TODO Auto-generated method stub "123549876"

	}
	public static String small(String s) {
		String p="";
		
		int ans[]=new int[s.length()+1];
		Stack<Integer>st=new Stack();
		int c=1;
		for(int i=0;i<=s.length();i++) {
			if(i==s.length()||s.charAt(i)=='I' ) {
			
			ans[i]=c;
			c++;
			while(!st.isEmpty()) {
				ans[st.pop()]=c;
				c++;
			}
		}
			else {
				st.push(i);
			}
		}
		for(int i=0;i<ans.length;i++) {
			p=p+ans[i];
	
			
		}
		return p;
	}

}
