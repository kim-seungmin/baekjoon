import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int count=0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			int number = Integer.parseInt(st.nextToken());
			if(number < 2) {
				continue;
			}
			if(number == 2) {
				count++;
				continue;
			}

			for(int i = 2; i < number; i++) {		        
				if(number % i == 0) {						
					break;
				}
				if(i==number-1)count++;
			}
		}
		System.out.println(count);
	}	
}
