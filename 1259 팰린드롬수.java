import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String input = sc.nextLine();
			//System.out.println(input);			
			if(input.equals("0"))break;
			char[] reverse = new char[input.length()];
			for(int i=0;i<input.length();i++){
				reverse[i]=input.charAt(input.length()-i-1);
			}	
			//System.out.println(input+" , "+new String(reverse)+" , "+input.equals(new String(reverse)));
			if(input.equals(new String(reverse))) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

}	
