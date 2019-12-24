import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int length,breadth,area;
      Scanner s=new Scanner(System.in);
      length=s.nextInt();
      breadth=s.nextInt();
      area=length*breadth;
      System.out.println(area);
	}
}