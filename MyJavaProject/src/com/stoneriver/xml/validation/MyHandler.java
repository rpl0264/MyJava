package com.stoneriver.xml.validation;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {

	@Override
	public void startDocument() throws SAXException {
		// super.startDocument();
		System.out.println("Parsing Start");

	}

	public void endDocument() throws SAXException {
		System.out.println("Parsing Ends");

	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		// super.startElement(uri, localName, qName, attributes);
		System.out.println("Start Element: " + qName);

		for (int i = 0; i < attributes.getLength(); i++) {
			System.out.println("  Attribute: " + attributes.getLocalName(i) + ": " + attributes.getValue(i));

		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		// super.endElement(uri, localName, qName);
		System.out.println("End Element: " + qName);
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		//super.characters(ch, start, length);
		
		String nodeValue = new String(ch, start, length);
		
		if (!nodeValue.trim().equals(""))
		{
			System.out.println("Node value: " + nodeValue);
		}
	}

}
