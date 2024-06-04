package oops;

public class inheritance {

	public static void main(String[] args) {
//		fish rohu=new fish();
//		rohu.eat();

		
//		dog d=new dog();
//		d.eat();
//		d.lags=4;
//		System.out.println(d.lags);
		
		
		
	
	}

}
// Base class or Parent class

class Animal{
	String color;
	void eat() {
		System.out.println("eat");
	}
	void breathe() {
		System.out.println("breathe");
	}
}

class mammal extends Animal{
	void walk() {
		System.out.println("walk");
	}
	
}
class fish extends Animal{
	void swim() {
		System.out.println("swim");
	}
	
	
}
class dog extends Animal{
	void tobark() {
		System.out.println("dog is tobarking");
	}
	
	
}




//
//class mammals extends Animal{
//	int lags;
//	
//}
//class dog extends mammals{
//	String breed;
//}
//
//
// //Derive class or child class
//class fish extends Animal{
//	int fins;
//	void swim() {
//		System.out.print("fish swim in water");
//	}
//}
