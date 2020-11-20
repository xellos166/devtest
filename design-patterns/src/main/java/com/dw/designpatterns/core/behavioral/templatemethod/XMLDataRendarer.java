package com.dw.designpatterns.core.behavioral.templatemethod;

public class XMLDataRendarer extends DataRendarer{

	@Override
	String readData() {
		return "XML data";
	}

	@Override
	String processData(String data) {
		return "Processed "+data;
	}

}
