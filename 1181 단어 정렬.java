import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());		
		String[] arr = new String[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=br.readLine();
		}
		Arrays.sort(arr);
		Arrays.sort(arr, new Comparator<String> () {
			@Override
			public int compare(String s1, String s2) {
				return s1.length()-s2.length();
			}
		});
		
		String prev = "";
		for(String prString: arr) {
			if(!prString.equals(prev)) {
				System.out.println(prString);
				prev = prString;
			}
		}
	}	
}
