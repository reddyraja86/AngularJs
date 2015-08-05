package com.features.staicMethodInInterface;


/*
 * Static methods are similar to default methods except that we can’t override them in the implementation classes. 
 * We cannot override the static method gives compile time error
 * 
 */
public class StaticMethodInInterface_Main  implements StaticInterface{
	
	
	/*@Override
	public static void thisIsStaticMethod(){
		System.out.println("--- THIS IS TestStaticMethod IN CLASS-----");
	}*/
	
	public static void main(String[] args) {
		StaticInterface.thisIsStaticMethod();
	}

}
