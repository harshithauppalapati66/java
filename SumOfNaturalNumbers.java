import java.io.*;
import java.util.*;
public class SumOfNaturalNumbers
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    for(inti=1;i<=n;i++)
    {
      sum=sum+i;
    }
    System.out.println("Sum of first "+n+" natural numbers is "+sum);
  }
}