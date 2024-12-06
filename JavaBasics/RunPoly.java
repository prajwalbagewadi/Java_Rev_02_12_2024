package oops;
import java.lang.*;
import java.util.*;
import java.io.*;
//runtime polymorphims
class A{
	public void Greet(String name){
		System.out.println("Good morning"+name);
	}
}

class B extends A{
	public void Greet(String name){
		System.out.println("Good night"+name);
	}
}
public class RunPoly extends A{
	@Override
	public void Greet(String name){
		System.out.println("Good evening"+name);
	}
	
	public static void main(String[] args){
		A o1=new RunPoly();
		o1.Greet("abc");
		A o2=new A();
		o2.Greet("abc");
		A o3=new B();
		o3.Greet("abc");
	}
}
