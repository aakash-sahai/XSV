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
public class Branch {
	private String name;	
	private List<Wire> wires;
	
	public Branch() {
		super();
		this.wires = new ArrayList<Wire>();
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
	 * @return the wires
	 */
	public List<Wire> getWires() {
		return wires;
	}
	/**
	 * @param wires the wires to set
	 */
	public void setWires(List<Wire> wires) {
		this.wires = wires;
	}
	
	public static Branch parse(Element el) throws Exception {
		Branch branch = new Branch();
		branch.name = el.getAttributeValue("name");
		Elements children = el.getChildElements();
		for (int i = 0; i < children.size(); i++) {
            Element c = children.get(i);
            String cname = c.getLocalName();
            if (cname.equals("wire")) {
            	branch.wires.add(Wire.parse(c)); 
            } else {
            	throw new Exception("Unknown child element under <branch>: " + cname);	
            }
		}
		return branch;
	}
}
