package com.features.defenderMethod;

class Defender_Main implements DefenderMethod{
	
	@Override
	public void show() {
		System.out.println("-- THIS IS SHOW---");
	}
	
	
	public static void main(String args[]){
		Defender_Main t = new Defender_Main();
		t.show();
		t.showDefault();
	}
}