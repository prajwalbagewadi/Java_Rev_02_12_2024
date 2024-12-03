package Stmt;
import java.lang.*;
import java.util.*;
public class SwitchStmt {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String opr;
		int a,b;
		System.out.println("enter the operator to calculate:");
		opr=sc.next();
		switch(opr){
			case "+":
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("add="+(a+b));
			break;
			case "-":
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("sub="+(a-b));
			break;
			case "*":
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("mul="+(a*b));
			break;
			case "/":
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("div="+(a/b));
			break;
			default:
				System.out.println("invalid operator selected.");
		}
	}
}
