package oops;
import java.util.*;
public class oop {
		
	public static void main(String[] args) {
		
		pen p1= new pen();
		
		p1.setcolor("Orang");
		System.out.println(p1.getcolor());
		
		p1.settip(150);
		System.out.println(p1.gettip());

	}

}

class pen{
	String color;
	int tip;
	
	
	String getcolor() {
		return this.color;
	}
	
	int gettip() {
		return this.tip;
	}
	
	void setcolor(String newcolor){
		color=newcolor;	
	}
	
	
	void settip(int newTip) {
		tip=newTip;
	}
	
}

class Student1 {
	String name;
	int age;
	float percentages;
	
	void calcPecrentage(int phy, int math, int che) {
		percentages=(phy+math+che)/3;
	}
}