import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		Deque<Integer> q = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n =Integer.parseInt(st.nextToken());
		for(int i=0;i< n;i++) {
			st = new StringTokenizer(br.readLine()," ");
			switch(st.nextToken()) {
			case "push":
				q.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(q.isEmpty()) {System.out.println("-1");}else {System.out.println(q.poll());}
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if(q.isEmpty()) {System.out.println("1");}else {System.out.println("0");}
				break;
			case "front":
				if(q.isEmpty()) {System.out.println("-1");}else {System.out.println(q.peek());}
				break;
			case "back":
				if(q.isEmpty()) {System.out.println("-1");}else {System.out.println(q.peekLast());}
				break;
			default:
				break;
			}		

		}

	}
}
