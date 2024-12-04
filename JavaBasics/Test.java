package admin;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.io.*;
/*
class A{
	//user defined methods
	public void Disp(){ //method def
		System.out.println("disp() method:");
		System.out.println("hello Good morning");
	}
}

public class Test {
	public static void main(String[] args){
		//predefined methods are directly called
		Double sqrtans=Math.sqrt(5);
		System.out.println("sqrt="+sqrtans);
		System.out.println("println is also a predef method of System");
		Double ceilans=Math.ceil(7.46);
		System.out.println("ceil="+ceilans);
		Double floorans=Math.floor(7.99);
		System.out.println("ceil="+floorans);
		//user def calling
		A obj=new A();
		obj.Disp();
	}
}
*/








class Employee{
	Scanner sc=new Scanner(System.in);
	public int id;      // class member
	public String name; // class member
	public float sal;   // class member
	//class method
	public void accept(){
		System.out.println("Enter emp name:");
		this.name=sc.next();
		System.out.println("Enter emp id:");
		this.id=sc.nextInt();
		System.out.println("Enter emp sal:");
		this.sal=sc.nextFloat();
	}
	//class method
		public void disp(){
			System.out.println("emp id:"+this.id);
			System.out.println("emp name:"+this.name);
			System.out.println("emp sal:"+this.sal);
		}
}

public class Test{
	public static void main(String[] args){
		//object of class 
		Employee e1=new Employee(); //e1 is the object
		e1.accept();
		e1.disp();
		Employee e2=new Employee();//e2 object
		e2.accept();
		e2.disp();
	}
}














