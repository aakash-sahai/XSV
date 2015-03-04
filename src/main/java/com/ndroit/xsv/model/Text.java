/**
 * 
 */
package com.ndroit.xsv.model;

import nu.xom.Element;

/**
 * @author Aakash Sahai
 *
 */
public class Text extends Geometry {
	
	protected int x, y;
	protected String style, text;

	/**
	 * 
	 */
	public Text() {
		super();
		this.x = this.y =  0;
	}
	
	/**
	 * 
	 */
	public Text(int x1, int y1, String style, String text) {
		super();
		this.x = x1;
		this.y = y1;
		this.style = style;
		this.text = text;
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
	
	public static Text parse(Element el) throws Exception {
		Text rect = new Text();
		rect.x = Integer.parseInt(el.getAttributeValue("x"));
		rect.y = Integer.parseInt(el.getAttributeValue("y"));
		rect.text = el.getValue();
		rect.style = el.getAttributeValue("style");
		return rect;
	}

}
