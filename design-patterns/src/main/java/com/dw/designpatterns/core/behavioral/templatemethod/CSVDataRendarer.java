package com.dw.designpatterns.core.behavioral.templatemethod;

public class CSVDataRendarer extends DataRendarer{

	@Override
	String readData() {
		return "CSV data";
	}

	@Override
	String processData(String data) {
		return "Processed "+data;
	}

}
