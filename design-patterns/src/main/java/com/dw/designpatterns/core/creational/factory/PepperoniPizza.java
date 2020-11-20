package com.dw.designpatterns.core.creational.factory;

public class PepperoniPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing PepperoniPizza");
	}

	@Override
	public void bake() {
		System.out.println("backing PepperoniPizza");
	}

	@Override
	public void cut() {
		System.out.println("cutting  PepperoniPizza");
	}

}
