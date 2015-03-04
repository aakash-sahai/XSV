/**
 * 
 */
package com.ndroit.xsv.model;

import nu.xom.Element;

/**
 * @author Aakash Sahai
 *
 */
public class Instance extends Geometry {
	
	protected int x, y;
	protected String name, orien;

	/**
	 * 
	 */
	public Instance() {
		super();
		this.x = this.y =  0;
	}
	
	/**
	 * 
	 */
	public Instance(int x1, int y1, String name, String orien) {
		super();
		this.x = x1;
		this.y = y1;
		this.name = name;
		this.orien = orien;
	}
	
	/* (non-Javadoc)
	 * @see com.ndroit.xsv.model.Geometry#draw(int, int)
	 */
	@Override
	public void draw(int atX, int atY) {
		this.draw(atX, atY, 1.0);
	}

	/* (non-Javadoc)
	 * @see com.ndroit.xsv.model.Geometry#draw(int, int, float)
	 */
	@Override
	public void draw(int atX, int atY, double scale) {
		// TODO Auto-generated method stub

	}
	
	public static Instance parse(Element el) throws Exception {
		Instance rect = new Instance();
		rect.x = Integer.parseInt(el.getAttributeValue("x"));
		rect.y = Integer.parseInt(el.getAttributeValue("y"));
		rect.orien = el.getAttributeValue("orien");
		rect.name = el.getAttributeValue("name");
		return rect;
	}

}
