import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
      System.out.print(i);
      if(i%3==0 && i!=n)
      {
        System.out.print(",");
      }
      
    }
  }
}