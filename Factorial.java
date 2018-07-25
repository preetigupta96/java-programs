import java.util.*;
class Factor
{

public static void main(String ar[])
{
 int num,fact=1;
System.out.println("enter any number to calculate factorial: ");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(num>0)
{

fact=fact*num;
num--;
}
System.out.println("The factorial is :"+fact);
}
}