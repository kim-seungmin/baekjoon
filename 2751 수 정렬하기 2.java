import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> list = new LinkedList<>();
//		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
			list.add(Integer.parseInt(br.readLine()));
		}
//		Arrays.sort(arr);
//		for(int num: arr) {
//			System.out.println(num);
//		}
		
		Collections.sort(list);  
		for(int num: list) {
			sb.append(num).append('\n');
		}
		System.out.print(sb);
	}	
}
