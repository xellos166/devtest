package com.dw.designpatterns.core.creational.factory;

public class VegPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing veg Pizza");
	}

	@Override
	public void bake() {
		System.out.println("backing veg Pizza");
	}

	@Override
	public void cut() {
		System.out.println("cutting  veg Pizza");
	}

}
