package com.features.defenderMethod;


/*
 * We can provide default implementation for the method by using default 
 * Implemented class no need to implement this interface
 * */
public interface DefenderMethod {

	public void show();
	
	default public void showDefault() {
		System.out.println("--- THIS IS DEFENDER METHOD---");
	}
}

