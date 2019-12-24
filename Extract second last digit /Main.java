import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int n1,sum=0;
      Scanner s=new Scanner(System.in);
        n1=s.nextInt();
      sum=(n1%100)/10;
      System.out.println(sum);
	}
}