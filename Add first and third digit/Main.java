import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int n1,q,sum=0,r;
      Scanner s=new Scanner(System.in);
      n1=s.nextInt();
      q=n1/100;
      r=n1%10;
      sum=q+r;
      System.out.println(sum);
      
	}
}