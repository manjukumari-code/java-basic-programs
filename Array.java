import java.util.*;
class Array
{
public static void main()
{
Scanner in=new Scanner(System.in);
int n,i,s=0;
System.out.print("enter the no:");
n=in.nextInt();
for(i=1;i<=n;i++)
{
s=s+i;
}
System.out.print("sum of array="+s);
}
}
