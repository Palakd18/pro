
public class Outer {
private int i=100;
public void show()
{
	System.out.println("in outer class");
}
class Inner
{
	private int j=200;
	public void test()
	{
		System.out.println("in inner class");
		System.out.println("outer data:"+i);
	}
}
public static void main(String args[])
{Outer o=new Outer();
o.show();
Outer.Inner oi=o.new Inner();
oi.test();
}
}
