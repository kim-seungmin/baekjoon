import java.util.*;



public class Main {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1;i<=n;i++) {
        	que.offer(i);        	
        }
        System.out.print("<");
        while(que.size()!=1) {
        	for(int i=0;i<m-1;i++) {
        		que.offer(que.poll());
        	}
        	System.out.print(que.poll()+", ");
        }
        System.out.print(que.poll()+">");
        
    }
}
