package com.dw.designpatterns.core.creational.factory;

public class ChickenPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Preparing Chicken Pizza");
	}

	@Override
	public void bake() {
		System.out.println("backing Chicken Pizza");
	}

	@Override
	public void cut() {
		System.out.println("cutting  Chicken Pizza");
	}

}
