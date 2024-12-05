package oops;
import java.lang.*;
import java.util.*;
import java.io.*;
//compile time polymorphism
class A{
	public void add(int a,int b){
		System.out.println("add="+(a+b));
	}
}
public class Poly extends A{
	//overloading
	public void add(int a,int b,int c){
		System.out.println("add="+(a+b+c));
	}
	
	public static void main(String[] args){
		A objA = new A(); 
		Poly objPoly = new Poly();
		objA.add(10,20);
		objPoly.add(10,20,30);
	}
}
