package com.dw.designpatterns.core.creational.abstractfactory;

public class XMLDeptDao implements Dao{

	@Override
	public void save() {
		System.out.println("Saving Dept to XML");
	}

}
