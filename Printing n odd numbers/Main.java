import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      int n,i;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(i=0;i<=(2*n);i++)
      {
        if(i%2==1)
        {
          System.out.println(i);
        }
      }
	}
}