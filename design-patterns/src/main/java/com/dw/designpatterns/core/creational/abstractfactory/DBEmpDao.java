package com.dw.designpatterns.core.creational.abstractfactory;

public class DBEmpDao implements Dao{

	@Override
	public void save() {
		System.out.println("Saving Emp to DB");
	}

}
