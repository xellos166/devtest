package com.dw.designpatterns.core.behavioral.templatemethod;

public abstract class DataRendarer {
	public void render() {
		String data = readData();
		String processedData = processData(data);
		System.out.println(processedData);
	}

	abstract String readData();

	abstract String processData(String data);

}
