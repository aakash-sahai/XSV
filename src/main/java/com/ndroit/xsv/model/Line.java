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
public class Line extends Geometry {
	
	protected int x1, x2, y1, y2;

	/**
	 * 
	 */
	public Line() {
		super();
		this.x1 = this.x2 = this.y1 = this.y2 = 0;
	}
	
	/**
	 * 
	 */
	public Line(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
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
	
	public static Line parse(Element el) throws Exception {
		Line line = new Line();
		line.x1 = Integer.parseInt(el.getAttributeValue("x1"));
		line.y1 = Integer.parseInt(el.getAttributeValue("y1"));
		line.x2 = Integer.parseInt(el.getAttributeValue("x2"));
		line.y2 = Integer.parseInt(el.getAttributeValue("y2"));
		return line;
	}

}
