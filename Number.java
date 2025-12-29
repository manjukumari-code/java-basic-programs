import java.util.*;
class Number
{
public static void main()
{
Scanner in=new Scanner(System.in);
int i,n,f=1;
System.out.print("enter the no=");
n=in.nextInt();
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.print("Factorial of "+n+" is "+f);
}
}
