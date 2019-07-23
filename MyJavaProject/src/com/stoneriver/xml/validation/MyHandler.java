package com.stoneriver.xml.validation;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * Create a handler class to parse XML document
 * Extends DefaultHandler
*/
public class MyHandler extends DefaultHandler {
	
	//For specific values
	private String actualNodeName;

	// Starts at the beginning of the document.
	@Override
	public void startDocument() throws SAXException {
		// super.startDocument();
		System.out.println("Parsing Start");

	}

	// ends of the document
	@Override
	public void endDocument() throws SAXException {
		System.out.println("Parsing Ends");

	}

	/*
	 * 
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		// super.startElement(uri, localName, qName, attributes);
		// qName is currently parsed elements
		
		this.actualNodeName = qName;
		
		System.out.println("Start Element: " + qName);

		/*
		 * This reads the parameters.attribute name-getLocalName and values-getValue
		 */
		for (int i = 0; i < attributes.getLength(); i++) {
			System.out.println("  Attribute: " + attributes.getLocalName(i) + ": " + attributes.getValue(i));

		} // end of for loop
	}

	// End of the element
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		// super.endElement(uri, localName, qName);
		System.out.println("End Element: " + qName);
	}
	/*
	 * Read the content of the documents. Accepts 3 parameters.
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		// super.characters(ch, start, length);
		
		//Only retrieve the values for <name> element
		if (!actualNodeName.equals("name")) {
			return;
		}
		
		
		//Use the string constructor
		String nodeValue = new String(ch, start, length);
		
		//Check if any content exist. Remove empty spaces. Writes out the value.
		if (!nodeValue.trim().equals("")) {
			System.out.println("Node value: " + nodeValue);
		}
	} //end of characters method

}
