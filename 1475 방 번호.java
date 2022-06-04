import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int[] num={0,0,0,0,0,0,0,0,0,0};
		for(int i=0;i<s[0].length();i++) {
			num[Character.getNumericValue(s[0].charAt(i))]++;
		}
		double temp = (double)(num[6]+num[9])/2;
		num[6]=(int)Math.ceil(temp);
		num[9]=num[6];
		System.out.println(Arrays.stream(num).max().getAsInt());
	}
}
