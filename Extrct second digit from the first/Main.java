import java.util.*;
class Main
{
	public static void main(String args[])
	{
		int n,m,a,i=1,counter=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        m=n;
        while(n>0)
        {
            n=n/10;
            counter=counter+1;
        }
        while(m>0)
        {
            a=m%10;
            if(counter==2)
           {
            System.out.println(a);
            }
            m=m/10;
            counter--;
        }
	}
}