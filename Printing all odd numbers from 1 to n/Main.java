import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(int i=0;i<=n;i++)
      {
        if(i%2==1)
        {
          System.out.println(i);
        }
      }
	}
}