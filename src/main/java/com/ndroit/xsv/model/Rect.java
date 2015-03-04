/**
 * 
 */
package com.ndroit.xsv.model;

import nu.xom.Element;

/**
 * @author Aakash Sahai
 *
 */
public class Rect extends Geometry {
	
	protected int x, y, height, width;

	/**
	 * 
	 */
	public Rect() {
		super();
		this.x = this.y = this.height = this.width = 0;
	}
	
	/**
	 * 
	 */
	public Rect(int x1, int y1, int height, int width) {
		super();
		this.x = x1;
		this.y = y1;
		this.height = height;
		this.width = width;
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
	
	public static Rect parse(Element el) throws Exception {
		Rect rect = new Rect();
		rect.x = Integer.parseInt(el.getAttributeValue("x"));
		rect.y = Integer.parseInt(el.getAttributeValue("y"));
		rect.width = Integer.parseInt(el.getAttributeValue("width"));
		rect.height = Integer.parseInt(el.getAttributeValue("height"));
		return rect;
	}

}
