package abc;
import java.lang.*;
import java.util.*;

public class Conditional {
	public static void main(String[] args){
		//if
		int a=15,b=10;
		if(a<b){
			System.out.println("a is less than b");
		}
		//if else
		a=4;
		b=10;
		if(a<b){
			System.out.println("a is less than b");
		}
		else{
			System.out.println("a is greater than b");
		}
		//else_if
		if(a<b){
			System.out.println("a is less than b");
		}
		else if(a==b){
			System.out.println("a is equal to b");
		}
		else{
			System.out.println("a is greater than b");
		}
		//nested if else
		if(a!=b){
			System.out.println("a is not equal to b");
			if(a<b){
				System.out.println("a is less than b");
			}
		}
		else{
			System.out.println("nested if not executed");
		}
	}
}
