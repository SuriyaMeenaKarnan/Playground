import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n,i,j,num=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        {
          if(num%2==0)
          {
            
             System.out.print("*");
          }
          else
          {
            System.out.print("#");
         
          }
          num=num+1;
        }
        System.out.println();
      }
    }
}