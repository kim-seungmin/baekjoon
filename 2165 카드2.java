import java.util.*;

public class Main {
	
	public static void main(String[] args) {    	
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Queue<Integer> card = new LinkedList<>();
		for(int i=1;i<=n;i++) {
			card.add(i);
		}
		while(!(card.size()==1)) {
			card.remove();
			card.add(card.poll());
		}
		System.out.println(card.poll());		
	}
}