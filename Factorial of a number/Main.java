import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      int i,fact=1,n;  
  Scanner s=new Scanner(System.in);
      n=s.nextInt();
  for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println(fact);    
 
      
	}
}