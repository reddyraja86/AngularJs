package com.features.LamdaExpression;

/*
 * Interface must be a functional Interface
 * 
 * 
 * */
public class LamdaExpression_Main {

	public static void main(String[] args) {

		callFunction(new Anonymous() {
			@Override
			public void show(String s) {
				System.out.println("--- THIS IS IMPL USING ANONYMOUS---");
			}
		});

		callFunction((String s) -> System.out.println("----- THIS IS LAMDA FUCNTION-----"));

		Anonymous a = (String d) -> System.out.println("----" + d);

	}

	public static void callFunction(Anonymous a) {
		String s = "";
		a.show(s);
	}

}
