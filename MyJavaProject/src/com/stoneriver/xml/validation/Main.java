package com.stoneriver.xml.validation;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class Main {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		SAXParserFactory spf = SAXParserFactory.newInstance();
		SAXParser sp = spf.newSAXParser();
		
		sp.parse("C:/GitHub/MyJava/MyJavaProject/src/com/stoneriver/xml/validation/intro.xml", 
				new MyHandler());
		
	}//end of main

}
