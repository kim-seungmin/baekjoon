import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int total = 0;
		 for(int i=0;i<5;i++) {
			 int tmp = sc.nextInt();
			 tmp *= tmp;
			 total += tmp;			 
		 }
		 System.out.println(total%10);
	}
}	