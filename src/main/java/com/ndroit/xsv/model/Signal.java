/**
 * 
 */

package com.ndroit.xsv.model;

import nu.xom.Element;
import nu.xom.Elements;

/**
 * @author Aakash Sahai
 *
 */
public class Signal {
	
	private String name;
	
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

	public static Signal parse(Element el) throws Exception {
		Signal signal = new Signal();
		signal.name = el.getAttributeValue("name");
		return signal;
	}
}
