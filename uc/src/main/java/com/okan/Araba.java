package com.okan;

public class Araba {
	private Yakit yakit;
	
	public Araba(Yakit yakit ) {
		this.yakit=yakit;
		
	}
	
	public void hareketeGec() {
		yakit.depo(); 
		System.out.println("Araba harakete geçti");
	}
}
