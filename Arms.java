import java.util.*;
class ArmstrongNo
{

public static void main(String arg[])
{

int n,a,sum=0,rem=0;
Scanner sc=new Scanner(System.in);
System.out.println("\n Enter any number");
n=sc.nextInt();
a=n;
while(n>0)
{

rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(sum==a)
{
System.out.println("the no is Armstrong no");
}
else
System.out.println("Not Armstrong");

}
}