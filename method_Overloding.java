package oops;

public class method_Overloding {

	public static void main(String[] args) {
		
//		calculater c=new calculater();
//		System.out.println(c.sum(12, 15));
//		System.out.println(c.sum(12.5f, 15.5f));
//		System.out.println(c.sum(12, 15,20));
//		System.out.println(c.sum(12.5f, 15.5f,20.0f));
		
		
		Girl G=new Girl();
		G.proposed();
		
		
		

	}

}


class boy{
	void proposed() {
		System.out.print("i love you");
	}
}

class Girl extends boy{
	void proposed() {
		System.out.println(" i heat you");
	}
}

class calculater{
	int sum(int a, int b)
	{
		return a+b;
	}
	
	float sum(float a, float b) {
		return a+b;
	}
	
	int sum(int a, int b,int c)
	{
		return a+b+c;
	}
	
	
	float sum(float a, float b,float c) {
		return a+b+c;
	}
	
}