package com.features.funcionalInterface;

/*
 * WE should have only one method 
 * We can have object class methods
 * */
@FunctionalInterface
public interface  FistFunctionalInteface {
	public void add();
	
	//Object class methods
	public String toString();
	public int hashCode();
	
	
}
