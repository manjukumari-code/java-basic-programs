import java.util.*;
class Loops
{
public static void main()
{
Scanner in=new Scanner(System.in);
int i,n,c=0;
System.out.print("enter the no=");
n=in.nextInt();
for(i=1;i<=n;i++)
{
if(n%i==0)
c=c+1;
}
if(c==2)
{
System.out.print("Prime no.");
}
else
{
System.out.print("Not prime no.");
}
}
}
