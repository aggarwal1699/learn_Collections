package learnStack;

import java.util.Stack;

public class Balance_Brackets_Problem {

	static boolean isBracketBalenced1(char[] ch) {
		boolean isBal=true;
		Stack<Character> st=new Stack<>();
		for(int i=0;i<ch.length;i++) {
			char x=ch[i];
			if(x=='('||x=='['||x=='{') {
				st.push(x);
			}
			
			if(st.isEmpty()) {
				isBal=false;
				return isBal;
			}
			
			if(x==')') {
				char check=st.pop();
				if(check!='(') {
					isBal=false;
					return isBal;
				}
			}
			if(x==']') {
				char check=st.pop();
				if(check!='[') {
					isBal=false;
					return isBal;
				}
			}
			if(x=='}') {
				char check=st.pop();
				if(check!='{') {
					isBal=false;
					return isBal;
				}
			}
			}
		return (st.isEmpty());
	}
	
	static boolean isBracketBalanced(char[] ch) {
		Stack st=new Stack();
		
		for (int i=0;i<ch.length;i++) {
			char x=ch[i];
			if(x=='('|| x=='{'|| x=='[') {
				st.push(ch[i]);
				continue;
			}
			if(st.isEmpty()) {
				return false;
			}
			
			char check;
			switch(x) {
			case(')'):
				check=(char) st.pop();
				if(check=='{'|| check=='[') {
					return false;
				}
				break;
			case('}'):
				check=(char) st.pop();
				if(check=='('|| check=='[') {
				return false;
				}
			break;
			case(']'):
				check=(char) st.pop();
				if(check=='{'|| check=='(') {
				return false;
				}
			break;
			}
		}
		return (st.isEmpty());
		
	}
	
	public static void main(String[] args) {

		String s="({[[{}[()]]})";
		String s1="({[[{}()]]})";
		char ch[]=new char[s.length()];
		char ch1[]=new char[s1.length()];
		
		for(int i=0;i<ch.length;i++) {
			ch[i]=s.charAt(i);
		}
		for(int i=0;i<ch1.length;i++) {
			ch1[i]=s1.charAt(i);
		}
		System.out.println(isBracketBalenced1(ch));
		System.out.println(isBracketBalanced(ch1));
	}

}
