import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int n,q,r,sum;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      q=n/10;
      r=n%10;
      sum=q+r;
      System.out.println(sum);
	}
}