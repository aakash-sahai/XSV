/**
 * 
 */

package com.ndroit.xsv.model;

import nu.xom.Attribute;
import nu.xom.Element;

/**
 * @author Aakash Sahai
 *
 */
public class Trait {
	
	private String name;	
	private String value;
	
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
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	public static Trait parse(Element el) throws Exception {
		Trait trait = new Trait();
		
		for (int i = 0; i < el.getAttributeCount(); i++) {
			Attribute attr = el.getAttribute(i);
			trait.name = attr.getLocalName();
			trait.value = attr.getValue();
		}
		return trait;
	}
}
