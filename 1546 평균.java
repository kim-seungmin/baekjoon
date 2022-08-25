import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		float[] score = new float[n];		

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		
		Arrays.sort(score);
		
		float total = 0;
		for(int i=0;i<n;i++) {
			total += score[i]/score[n-1]*100;
		}
		System.out.println(total/n);
	}	
}