package com.features.Lamda;

import java.util.ArrayList;
import java.util.List;


public class LamdaExpression {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("e");
		l.add("d");
		l.add("b");
		l.add("c");
		l.forEach( ( String e ) -> System.out.println( e ) );
		l.sort((String o1,String o2) -> o1.compareTo(o2));
		l.forEach( ( String e ) -> System.out.println( e ) );
		
		
		callFunction(new Anonymous() {
			@Override
			public void show(String s) {
			 System.out.println("--- THIS IS IMPL USING ANONYMOUS---");	
			}
		});
		
		callFunction((String s) -> System.out.println("----- THIS IS LAMDA FUCNTION-----"));
		
		Anonymous a= (String d)-> System.out.println("----"+d);
		
	}

	
	public static void callFunction(Anonymous a){
		String s="";
		a.show(s);
	}
	
}


