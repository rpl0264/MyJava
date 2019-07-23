package com.stoneriver.xml.dom;

import java.io.IOException;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		
		//create factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		//new instance of db class
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		Document doc = db.parse("C:/github/MyJava/MyJavaProject/src/com/stoneriver/xml/dom/books.xml");
		
		//Element root = doc.getDocumentElement();
		
	}

}
