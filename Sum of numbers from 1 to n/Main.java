import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      int n,i,sum=0;
      Scanner s=new Scanner(System.in);
        n=s.nextInt();
      for(i=0;i<=n;i++)
      {
        sum=sum+i;
      }
      System.out.println(sum);
	}
}