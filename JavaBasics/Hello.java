package example;
import java.lang.*;
import java.util.Scanner;

class Test{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("hello world");
		System.out.println("Enter num for a=");
		int a=sc.nextInt();
		System.out.println("Enter num for b=");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum="+c);
		//Arithmetic
		c=a+b;
		System.out.println("add="+c);
		c=a-b;
		System.out.println("sub="+c);
		c=a*b;
		System.out.println("mul="+c);
		c=a/b;
		System.out.println("div="+c);
		c=a%b;
		System.out.println("mod="+c);
		//relational
		System.out.println("Enter num for a=");
		a=sc.nextInt();
		System.out.println("Enter num for b=");
		b=sc.nextInt();
		boolean r;
		r=(a==b);
		System.out.println("=="+r);
		r=(a!=b);
		System.out.println("!="+r);
		r=(a<b);
		System.out.println("<"+r);
		r=(a>b);
		System.out.println(">"+r);
		r=(a<=b);
		System.out.println("<="+r);
		r=(a>=b);
		System.out.println(">="+r);
	}
}
