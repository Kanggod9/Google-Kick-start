import java.util.Scanner ;
public class Boring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner reader = new Scanner(System.in);
        String s;
        long i,k,o;  
        int j,count=0;
        int T = reader.nextInt();
        while(T>0) { 
        int	answer=0;
        long L =reader.nextLong();
        long R = reader.nextLong();        
        for(i=L;i<=R;i++) {
        	 k=i;
        	 s="\0";
        	while(k!= 0) {
        		s=s+k%10;
        		k=k/10;
        	}
        	
        	for(j=s.length()-1,o=1;j>=1;j=j-1,o=o+1) {
        		if((s.charAt(j)-32)%2 != o%2) {
        			
        			break;
        			
        		}
        	}
        		if (j<1) {
        			answer++;
        		}
        	
        	System.out.println(i);
        }
        T--;
        count++;
        System.out.println("Case #" + count +": " + answer);
	} 
	}
}
	
