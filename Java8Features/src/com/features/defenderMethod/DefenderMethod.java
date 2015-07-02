package com.features.defenderMethod;

public interface DefenderMethod {

	public void show();
	
	default public void showDefault() {
		System.out.println("--- THIS IS DEFENDER METHOD---");
	}
}

