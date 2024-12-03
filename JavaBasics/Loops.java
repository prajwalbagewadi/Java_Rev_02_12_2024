package loo;
import java.lang.*;
public class Loops {
	public static void main(String[] args){
		//whileloop
		int i=1; //initilization
		while(i<10){ //condition check
			System.out.println(i);
			i++; //(unary opr) increament
		}
		//do while loop
		i=10; //initilization
		do{ 
			System.out.println(i);
			i++; //(unary opr) increament
		}while(i<10);//condition check
		//for loop
		//	init,condition,increament
		for(i=1 ;  i<10    ; i++){
			System.out.println(i);
		}
		//reverse
		for(i=10 ;  i>=1    ; i--){
			System.out.println(i);
		}
	}
}
