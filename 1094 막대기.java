import java.util.Scanner;
public class Main {
	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		int stick=64;
		int X = sc.nextInt();
		//int X=48;
		int round=0;
		while(X>0) {	
			
			if(stick>X) {
				stick/=2;
			}else{
				round++;
				X-=stick;
			}
		}
		System.out.println(round);
	}
}
