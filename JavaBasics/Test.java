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
		//operators
		//Arithmetic opr
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
		//relational opr
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
		//Assignment opr
		a=b;
		System.out.println("="+a);
		a+=b;
		System.out.println("+="+a);
		a-=b;
		System.out.println("-="+a);
		a*=b;
		System.out.println("*="+a);
		a/=b;
		System.out.println("/="+a);
		a%=b;
		System.out.println("%="+a);
		//logical opr
		boolean res;
		System.out.println("a="+a+" b="+b);
		res=a<b && a!=b;
		System.out.println("&&"+res);
		res=a==b || a<b;
		System.out.println("||"+res);
		res=!(a==b);
		System.out.println("!"+res);
		//ternary
		int ans=(a<b)?a:b;
		System.out.println("ans="+ans);
		//bitwise opr
		int i=8;
		int j=10;
		ans=i&j;
		System.out.println("&="+ans);
		ans=i|j;
		System.out.println("|="+ans);
		ans=i^j;
		System.out.println("^="+ans);
		ans=~i;
		System.out.println("~="+ans);
		//shift
		a=10;
		b=1;
		System.out.println("<<"+(a<<b));
		System.out.println(">>"+(float)(a>>b));
	}
}
