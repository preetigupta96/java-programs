import java.util.*;
public class PrimeNo 
{
    public static void main(String[] args) 
    {
        int num,flag=0;
        System.out.println("\n Enter any number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num==1 || num==0)
        {
          System.out.println("The no. is not Prime");
        }
        else
        {
        for(int i=2;i<num/2;num++)
        {
        if(num%i==0)
        {
        System.out.println("The number is not prime"+num);
        flag=0;
        break;
        }
        }
        if(flag==1)
        {
          System.out.println("The no is prime"+num);
        }
            
        
        }
        
        }
}
