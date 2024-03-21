import java.util.*;
class Insertionsort
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[6];
int i,k,temp;
System.out.println("Enter 6 element");
for(i=0;i<6;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Element before sort");
for(i=0;i<6;i++)
{
System.out.println(a[i]);
}
for(i=0;i<6;i++)
{
for(int j=i+1;j<6;j++)
{
if(a[i]>a[j])
{
temp=a[j];
for(k=j;k>i;k--)
{
a[k]=a[k-1];
}
a[k]=temp;
}
}
}
System.out.println("After sort");
for(i=0;i<6;i++)
{
System.out.println(a[i]);
}
}
}