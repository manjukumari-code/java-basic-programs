import java.util.*;
class String
{
public static void main()
{
Scanner in=new Scanner(System.in);
int i,l;
char b;
String s,s1="";
System.out.print("enter the name=");
s=in.next();
l=s.length();
for(i=0;i<l;i++)
{
b=s.charAt(i);
if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u')
s1=s1+(char)(b+1);
else
s1=s1+b;
}
System.out.print("new word="+s1);
}
}
