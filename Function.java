import java.util.*;
class Function
{
public static int sum(int a[])
{
int i,s=0;
for(i=0;i<10;i++)
{
s=s+a[i];
}
return s;
}

public static int even(int a[])
{
int i,e=0;
for(i=0;i<10;i++)
{
if (a[i]%2==0)
{
e=e+a[i];
}
}
return e;
}

public static int max(int a[])
{
int i,max;
max=a[0];
for(i=0;i<10;i++)
{
if (a[i]>max)
{
max=a[i];
}
}
return max;
}

public static void main()
{
Scanner in=new Scanner(System.in);
int a[]=new int[10],i,ch,c;
do{
System.out.println("1.Sum of array");
System.out.println("2.Sum of even");
System.out.println("3.Maximum in array");
System.out.print("enter your choice=");
ch=in.nextInt();

for(i=0;i<10;i++)
{
System.out.print("enter the number=");
a[i]=in.nextInt();
}
switch(ch)
{
case 1:
c=sum(a);
System.out.println("sum of array="+c);
break;

case 2:
c=even(a);
System.out.println("sum of even array="+c);
break;

case 3:
c=max(a);
System.out.println("maximum="+c);
break;
}
}while (ch!=4);
}
}

