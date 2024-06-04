package oops;
import java.util.*;

public class constructors {

    public static void main(String args[]) {

        student s1 = new student();
        System.out.println(s1.name);
        System.out.println(s1.roll);
        s1.name="rao";
        s1.roll=1234;
        s1.password="abcde";
        s1.mark[0]=100;
        s1.mark[1]=98;
        s1.mark[2]=97;
//        

        
        student s2=new student(s1);
           s2.password="xyz";
        for(int i=0; i<3; i++) {
        	System.out.println(s2.mark[i]);
        }
        
    }

}

class student {
    String name;
    int roll;
    String password;
    int mark[];
    // copy constructor
    //shallow copy 
    student(student s1){
    	mark =new int[3];
    	this.name="kumar";
    	this.roll=2121971;
    	this.mark=mark;
    	
    }
    
    student(){
    	mark=new int[3];
    	System.out.println("constructor is called");
    }

    student(String name) {
    	mark=new int[3];
        this.name = name; // initialize the instance variable with the local variable
    }
   student(int roll){
	   mark=new int[3];
	   this.roll=roll;
   }
    
    
}