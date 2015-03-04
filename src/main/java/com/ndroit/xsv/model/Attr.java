/**
 * 
 */

package com.ndroit.xsv.model;

import java.util.ArrayList;
import java.util.List;

import nu.xom.Element;
import nu.xom.Elements;

/**
 * @author Aakash Sahai
 *
 */
public class Attr {
	private String name;	
	private String value;
	private List<Trait> traits;
	
	public Attr() {
		traits = new ArrayList<Trait>();
	}
	
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
	/**
	 * @return the traits
	 */
	public List<Trait> getTraits() {
		return traits;
	}
	/**
	 * @param traits the traits to set
	 */
	public void setTraits(List<Trait> traits) {
		this.traits = traits;
	}
	
	public static Attr parse(Element el) throws Exception {
		Attr attr = new Attr();
		attr.value = el.getAttributeValue("value");
		attr.name = el.getAttributeValue("name");
		Elements children = el.getChildElements();
		for (int i = 0; i < children.size(); i++) {
            Element c = children.get(i);
            String cname = c.getLocalName();
            if (cname.equals("trait")) {
            	attr.traits.add(Trait.parse(c));
            } else {
            	throw new Exception("Unknown child element under <attr>: " + cname);	
            }
		}
		return attr;
	}
	
}
