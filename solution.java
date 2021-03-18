import java.util.Scanner;
public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner reader = new Scanner(System.in);
         int T = reader.nextInt();
         int c = 0;
         while(T>0)
         {
        	long N = reader.nextLong(); //number of levels in the game
        	long K = reader.nextLong(); //current level you are in
        	long S = reader.nextLong(); //level you have to pick up the sword
        	long a1 = (K-1) + (N+1);
        	long a2 = (K-S) + (N-S+1)+(K-1);
        	c ++;
        	T --;
        	if(a1 < a2) {
        		System.out.println("Case #" + c + ": " + a1);
        	}
        	else {
        		System.out.println("Case #" + c + ": " + a2);
        	}
        		
	}
        
         
  }
}