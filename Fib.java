import java.util.*;
class Fiboo
{
    public static void main(String[] args) 
    {

	int a=0,b=1,c,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("\n Enter the series up to which you want ");
	n=sc.nextInt();
	c=a+b;
	System.out.println(a+"\t"+b+"\t"+c);

	for(int i=2;i<n;i++)
	{
	  a=b;
	  b=c;
	  c=a+b;
	  System.out.println("\t"+c);
	}

	

    }
}
