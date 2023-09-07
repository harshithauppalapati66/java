import java.io.*;
import java.util.*;
public class StudentAverage
{
  public static void main(string args[])
  {
    int m1,m2,m3;
    System.out.println("Enter marks of 3 subjects");
    Scanner sc=new Scanner(System.in)
     m1=sc.nextInt();
    s m2=sc.nextnt();
     m3=sc.nextInt();
    int total=m1+m2+m3;
    float avg=(float)total/3;
    if(avg>=75)
    {
     System.out.println("Student passed in distinction");
    }
    else if(avg>=60&&avg<75)
    {
      System.out.println("Student passed in first class");
    }
    else if(avg>=50&&avg<60)
    {
     System.out.println("Student passed in second class");
    }
    else if(avg>=40&&avg<50)
    {
     System.out.println("Student passed in third class");
    }
    else
    {
     System.out.println("Student is failed");
    }
  }
}