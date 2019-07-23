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

		/*
		 * Create a SAXParser instance. Use new instance Then create the parser
		 */
		SAXParserFactory spf = SAXParserFactory.newInstance();
		// Create the parser from the factory instance
		// two exceptions to the main method
		SAXParser sp = spf.newSAXParser();

		/*
		 * Parse the XML document. Event based parsing it sends it to a handler . It need a
		 * handler to Accepts 2 parameters. The file and the handler.
		 */
		
		//set the file path and handler. The handler can implement certain interfaces. Throw exceptions to the mail
		sp.parse("C:/GitHub/MyJava/MyJavaProject/src/com/stoneriver/xml/validation/intro.xml", new MyHandler());

	}// end of main

}
