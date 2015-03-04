/**
 * 
 */

package com.ndroit.xsv.model;

import nu.xom.Element;

/**
 * @author Aakash Sahai
 *
 */
public class Port {
	
	private String name;	
	private String polarity;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the polarity
	 */
	public String getPolarity() {
		return polarity;
	}
	/**
	 * @param polarity the polarity to set
	 */
	public void setPolarity(String polarity) {
		this.polarity = polarity;
	}

	public static Port parse(Element el) throws Exception {
		Port port = new Port();
		port.name = el.getAttributeValue("name");
		port.polarity = el.getAttributeValue("polarity");
		return port;
	}
}
