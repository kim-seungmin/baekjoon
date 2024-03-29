
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder SB = new StringBuilder();
		
		HashMap<Integer, Integer> HM = new LinkedHashMap<>();
		
		int n = Integer.parseInt(st.nextToken());		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<n;i++) {
			int num = Integer.parseInt(st.nextToken());
			if(!HM.containsKey(num)) {
				HM.put(num, 1);
			}else {
				HM.put(num, HM.get(num)+1);
			}
						
		}
		
		st = new StringTokenizer(br.readLine()," ");
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<m;i++) {		
			int answerNum = Integer.parseInt(st.nextToken());
			if(!HM.containsKey(answerNum)) {
				SB.append(0+" ");;
			}else {
				SB.append(HM.get(answerNum)+" ");
			}
		}
		System.out.println(SB.toString());
		
	}
}
