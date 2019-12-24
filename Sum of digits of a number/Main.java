import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int n,sum=0,r;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      while(n>0)
      {
		r=n%10;
		sum=sum+r;
		n=n/10;
      }
	  System.out.println(sum);
}
}