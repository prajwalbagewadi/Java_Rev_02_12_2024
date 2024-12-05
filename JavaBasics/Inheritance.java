package oops;
import java.lang.*;
import java.util.*;
import java.io.*;

//single level inheritance
class A{ //parent class
	public int mul(int a,int b){ 
		//function with parameters and return type
		return a*b;
	}
}

class B extends A{ //child class
	public int div(int a,int b){ 
		//function with parameters and return type
		return a/b;
	}
}

//multi level inheritance
class Employee{
	public int id=1;
	protected String empname="abc";
}

class Dept extends Employee{
	protected String deptname="softwareDevelopment";
	public void disp(){
		System.out.println("Emp id="+this.id);
		System.out.println("Emp name="+this.empname);
		System.out.println("Emp deptname="+this.deptname);
	}
}

class Sal extends Dept{
	private double salary=55000.00;
	public void disp(){
		System.out.println("Emp id="+this.id); //employee
		System.out.println("Emp name="+this.empname);//employee
		System.out.println("Emp deptname="+this.deptname);//dept
		System.out.println("Emp salary="+this.salary);//sal
	}
}

//hierarchical inheritance 
class Acct{
	protected double bal=25000.00;
	public void disp(){
		System.out.println("Account bal:");
		System.out.println("acct bal="+this.bal);
	}
}
class CC extends Acct{
	public double emi=3643.00;
	public void disp(){
		this.bal=this.bal-this.emi;
		System.out.println("Account bal after emi payment:");
		System.out.println("acct bal="+(this.bal));
	}
}
class Rent extends Acct{
	public double rentamt=3000.00;
	public void disp(){
		System.out.println("Account bal after rent payment:");
		this.bal=this.bal-this.rentamt;
		System.out.println("acct bal="+(this.bal));
		System.out.println("total acct bal="+this.bal);
	}
}



public class Inheritance {
	public static void main(String[] args){
		//single level inheritance code
		int res;
		B objb=new B();
		res=objb.mul(12,7);
		System.out.println("res="+res);
		res=objb.div(12,7);
		System.out.println("res="+res);
		//multi level inheritance code
		Sal emp1=new Sal();
		emp1.disp();
		//hierarchical inheritance 
		CC creditcard=new CC();
		creditcard.disp();
		Rent roomrent=new Rent();
		roomrent.disp();
	}
}
