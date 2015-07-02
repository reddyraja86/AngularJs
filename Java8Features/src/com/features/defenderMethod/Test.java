package com.features.defenderMethod;
class Test implements DefenderMethod{
	@Override
	public void show() {
		System.out.println("-- THIS IS SHOW---");
		
	}
	
	
	public static void main(String args[]){
		
		Test t = new Test();
		t.show();
		t.showDefault();
	}
}