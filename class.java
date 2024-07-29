abstract class A
{
int a,b;
abstract void add();
}
class B extends A
{
void add()
{
a=5;
b=6;
int c=a+b;
System.out.println(c);
}
public static void main(String s[])
{
B ob=new B();
ob.add();
}
}