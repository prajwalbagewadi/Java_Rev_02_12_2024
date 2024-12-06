package cla;
import java.lang.*;

class A{
	private double bal;
	//constuctor used to initialize class 
	public A(){
		this.bal=1000.00;
	}
	public void disp() {
		System.out.println("bal"+bal);
	}
}
public class Constru{
	public static void main(String[] args){
		A obj=new A();
		obj.disp();
	}
}
