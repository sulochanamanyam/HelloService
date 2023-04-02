public class Helloworld {
	int noOfDoors=10;
	static int noOfBr=20;
	
	Helloworld() {
		System.out.println("Constructor frm Helloworld");
	}
	
	Helloworld(int a) {
		System.out.println("Constructor from noOfDoors:" + a);
	}
	
	Helloworld(int c, int d) {
		System.out.println("Constructor from noOfDoors:" + c + ":Number of doors:"+ d);
	}
	
	public static void main(String[] args) {

		Integer integer=new Integer(20);
		System.out.println("Helloworld");
		Helloworld helloObject1=new Helloworld();
		helloObject1.add(5,6);	
		helloObject1.noOfDoors=200;
		System.out.println(helloObject1.noOfDoors);
		
		helloObject1.add(5,6, 8);	
		helloObject1.multi(6,6);		
		Helloworld.multi(5,5);
		int noOfBr=50;
		System.out.println("No od Doors"+noOfBr);
		Helloworld helloObject2=new Helloworld(5);
		System.out.println(helloObject2.noOfDoors);
		Helloworld helloObject3=new Helloworld(5,20);
		
		
		Operations o=new Helloworld();
		o.add(1,3);
	}
	
	public void add(int a, int b) {
		int sum=a+b;
		System.out.println("Hello from test method and Sum:"+ sum);
	}
	
	public int add(int a, int b, int c) {
		int sum=a+b+c;
		System.out.println("Hello from test method and Sum:"+ sum);
		
		return sum;
	}
	
	public static int multi(int a, int b) {
		int multi=a*b;
		System.out.println("Hello from test method and multi:"+ multi);
		return multi;
	}
	
	{
		int x=100;
		System.out.println("IIB"+x);
	}
	
	static {
		System.out.println("SIB:"+ Helloworld.noOfBr);
	}
}

class Operations extends Helloworld {
	public void add1(int a, int c) {
		int sum=a+c;
		System.out.println("Hello from test method from Operations and Sum:"+ sum);
	}
}