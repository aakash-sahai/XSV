/**
 * 
 */
package com.ndroit.xsv.model;

import nu.xom.Element;

/**
 * @author Aakash Sahai
 *
 */
public class Iomarker extends Geometry {
	
	private int x, y;
	private String name;
	private String orien;
	private int fontsize;

	/**
	 * 
	 */
	public Iomarker() {
		super();
		this.x = this.y = 0;
	}
	
	/**
	 * 
	 */
	public Iomarker(int x1, int y1, String name, String orien, int fontsize) {
		super();
		this.x = x1;
		this.name = name;
		this.y = y1;
		this.orien = orien;
		this.fontsize = fontsize;
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
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
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
	 * @return the orien
	 */
	public String getOrien() {
		return orien;
	}

	/**
	 * @param orien the orien to set
	 */
	public void setOrien(String orien) {
		this.orien = orien;
	}

	/**
	 * @return the fontsize
	 */
	public int getFontsize() {
		return fontsize;
	}

	/**
	 * @param fontsize the fontsize to set
	 */
	public void setFontsize(int fontsize) {
		this.fontsize = fontsize;
	}

	public static Iomarker parse(Element el) throws Exception {
		Iomarker iomarker = new Iomarker();
		iomarker.x = Integer.parseInt(el.getAttributeValue("x"));
		iomarker.y = Integer.parseInt(el.getAttributeValue("y"));
		iomarker.fontsize = Integer.parseInt(el.getAttributeValue("fontsize"));
		iomarker.orien = el.getAttributeValue("orien");
		iomarker.name = el.getAttributeValue("name");
		return iomarker;
	}

}
