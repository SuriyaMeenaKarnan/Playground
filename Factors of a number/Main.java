import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(int i=1;i<=n;i++)
      {
        if(n%i==0)
        {
          System.out.println(i);
        }
      }
	}
}