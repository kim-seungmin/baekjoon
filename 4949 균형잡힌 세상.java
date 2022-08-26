import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		NL: while(true) {
			Stack<Character> mark = new Stack<>();
			String txt = br.readLine();
			if(txt.equals("."))break;
			 for(int i=0; i<txt.length();i++) {
//				System.out.println(i+": "+mark.toString());
//				System.out.println(i+": "+txt.charAt(i));
				switch(txt.charAt(i)) {
				case '{':
					mark.push('{');
					break;
				case '}':
					if(mark.empty()) {
						System.out.println("no");
						continue NL;
					}else if(mark.pop()!='{') {
						System.out.println("no");
						continue NL;
					}
					break;
				case '[':
					mark.push('[');
					break;
				case ']':
					if(mark.empty()) {
						System.out.println("no");
						continue NL;
					}else if(mark.pop()!='[') {
						System.out.println("no");
						continue NL;
					}
					break;
				case '(':
					mark.push('(');
					break;
				case ')':
					if(mark.empty()) {
						System.out.println("no");
						continue NL;
					}else if(mark.pop()!='(') {
						System.out.println("no");
						continue NL;
					}
				default : break;
				
				}
			}
			if(mark.empty()){System.out.println("yes");}else {System.out.println("no");}
			
		}
		
	}
}