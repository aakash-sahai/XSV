/**
 * 
 */

package com.ndroit.xsv.model;

import nu.xom.Element;

/**
 * @author Aakash Sahai
 *
 */
public class Blockpin {
	private String name;	
	private String signalname;
	
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
	 * @return the signalname
	 */
	public String getSignalname() {
		return signalname;
	}
	/**
	 * @param signalname the signalname to set
	 */
	public void setSignalname(String signalname) {
		this.signalname = signalname;
	}
	
	public static Blockpin parse(Element el) throws Exception {
		Blockpin blockpin = new Blockpin();
		blockpin.signalname = el.getAttributeValue("signalname");
		blockpin.name = el.getAttributeValue("name");
		return blockpin;
	}
}
