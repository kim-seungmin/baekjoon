import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{    	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++) {
			int h =sc.nextInt();
			int w =sc.nextInt();		
			int n =sc.nextInt();
		
			int x = n%h;
			int y = n/h+1;
			if(x==0) {
				x = h;
				y--;
			}
			System.out.println(x*100+y);
		}
	}
}
