package com.dw.designpatterns.core.creational.abstractfactory;

public class XMLEmpDao implements Dao{

	@Override
	public void save() {
		System.out.println("Saving Emp to XML");
	}

}
