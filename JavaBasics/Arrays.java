package admin;
import java.lang.*;
import java.util.*;
import java.io.*;

public class Arrays {
	public static void main(String[] args){
		System.out.println("");
		//static assignment
		//          0 1 2 3 4
		int[] arr1={1,2,3,4,5};
		// access data val through indexing
		System.out.println("arr1[3]="+arr1[3]);
		System.out.println("arr1[2]="+arr1[2]);
		
		//Dynamic assignment
		int[] arr2=new int[5];
//		arr2[0]=9;
//		arr2[1]=8;
//		arr2[2]=7;
//		System.out.println("arr2[1]="+arr2[1]);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr2.length;i++){
			System.out.println("Enter ele in arr2:");
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<arr2.length;i++){
			System.out.print(" arr2="+arr2[i]);
		}
	}
}
