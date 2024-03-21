import java.util.*;
class Linearsearch
{
public static void main (String args[])
{
int i,ele,flag=0;
int a[] = new int[4];
Scanner sc=new Scanner(System.in);
System.out.println("Enter element \n");
for(i=0;i<4;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Element are \n");
for(i=0;i<4;i++)
{
System.out.print(a[i]+"\t");
}
System.out.println("Enter elemnt to be search \n");
ele=sc.nextInt();
for(i=0;i<4;i++)
{
if(ele==a[i])
{
flag=1;
break;
}
}
if(flag==1)
System.out.print("element found successfully");
else
System.out.print("element not found");
}
}
