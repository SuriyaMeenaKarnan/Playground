import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int year,a,b,c;
      Scanner s=new Scanner(System.in);
      year=s.nextInt();
      a=year%4;
      b=year%100;
      c=year%400;
      if(a==0&&b==0&&c==0)
      {
        System.out.println("Leap year");
      }
      else
      {
        System.out.println("Non Leap year");
      }
        
    }
}