package ds;
import java.lang.*;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Iterator;
public class HashTab {
	public static void main(String[] args) {
		Hashtable<String,Double> emp=new  Hashtable<String,Double>();
		emp.put("rohan",25000.00);
		emp.put("amit",20000.00);
		emp.put("yash",28000.00);
		System.out.println(emp);
		Scanner sc=new Scanner(System.in);
		emp.remove("amit");
		System.out.println(emp);
		String name=sc.next();
		//emp.forEach((k,v)->{System.out.println(k+v);});
		emp.forEach((k,v)->{if(k.equals(name)) {
			System.out.println(k+v);
		}});
	}
}
