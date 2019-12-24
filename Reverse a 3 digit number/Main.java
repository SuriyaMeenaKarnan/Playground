import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int n,r1,r2,q,sum;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    q=n/100;
    r1=n%10;
     r2=(n%100)/10;
    sum=(r1*100)+(r2*10)+q;
      System.out.println(sum);
    
  }
}