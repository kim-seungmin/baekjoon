import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		HashSet<String> Aset = new HashSet<String>(Arrays.asList(br.readLine().split(" ")));
		//String[] A = br.readLine().split(" ");
		int m = Integer.parseInt(br.readLine());
		String[] B = br.readLine().split(" ");
		for(int i=0;i<m;i++) {
			if(Aset.contains(B[i])) {
				sb.append('1').append('\n');
			}else {
				sb.append('0').append('\n');
			}
		}
		System.out.println(sb);
	}
}	
