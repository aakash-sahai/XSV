/**
 * 
 */
package com.ndroit.xsv.model;

/**
 * @author Aakash Sahai
 *
 */
public class Rect extends Geometry {
	
	protected int x1, y1, length, width;

	/**
	 * 
	 */
	public Rect() {
		super();
		this.x1 = this.y1 = this.length = this.width = 0;
	}
	
	/**
	 * 
	 */
	public Rect(int x1, int y1, int length, int width) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.length = length;
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

}
