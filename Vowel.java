import java .util.*;
class Vowel{
public static void main(String[] Args){
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter a charater");
ch=sc.next().charAt(0);
switch(ch)
{
  case 'a':
  case 'e':
  case 'i':
  case 'u':
System.out.println("vowel");
default:
System.out.println("consonant");
}
}
}
