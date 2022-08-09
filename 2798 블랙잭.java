import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		} 
		System.out.println(search(arr,n,m));
		
	}

	private static int search(int[] arr,int n,int m) {		 
		int sum;
		int low = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					sum=arr[i]+arr[j]+arr[k];
					if(sum == m) {
						return sum;
					}
					if(sum<m && sum>low) {
						low=sum;
					}
				}
			}
		}
		return low;
	}
}	
