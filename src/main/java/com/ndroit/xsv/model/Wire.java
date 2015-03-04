/**
 * 
 */
package com.ndroit.xsv.model;

import nu.xom.Element;

/**
 * @author Aakash Sahai
 *
 */
public class Wire extends Line {

	/**
	 * 
	 */
	public Wire() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public Wire(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
		// TODO Auto-generated constructor stub
	}
	
	public static Wire parse(Element el) throws Exception {
		Wire wire = new Wire();
		wire.x1 = Integer.parseInt(el.getAttributeValue("x1"));
		wire.y1 = Integer.parseInt(el.getAttributeValue("y1"));
		wire.x2 = Integer.parseInt(el.getAttributeValue("x2"));
		wire.y2 = Integer.parseInt(el.getAttributeValue("y2"));
		return wire;
	}
}
