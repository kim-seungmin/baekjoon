
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		NL:
		for(int i=0;i<n;i++) {
			String txt = br.readLine();
			Stack<Character> mark = new Stack<>();
			for(int j=0; j<txt.length();j++) {
				if(txt.charAt(j)=='(') {
					mark.push('(');
				}
				else  if(txt.charAt(j)==')') {
					if(mark.empty()) {
						System.out.println("NO");
						continue NL;
					}
					else mark.pop();
				}
			}
			if(mark.empty())System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
