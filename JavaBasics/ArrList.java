package pkg;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Collections;

public class ArrList {
	public static void main(String[] args) {
		/*
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("cherry");
		list.add("orange");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.removeAll(list);
		System.out.println(list);
		list.add("grapes");
		list.add("banana");
		System.out.println(list);
		System.out.println(list.size());
		Collections.sort(list);
		System.out.println(list);
		*/
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(10);
		ll.add(30);
		ll.add(20);
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		ll.add(2);
		System.out.println(ll);
		System.out.println(ll.get(2));
	}
}
