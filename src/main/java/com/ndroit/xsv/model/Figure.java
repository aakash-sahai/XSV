/**
 * 
 */

package com.ndroit.xsv.model;

import java.util.List;

/**
 * @author Aakash Sahai
 *
 */
public abstract class Figure {
	
	private List<Geometry> objects;	

	public abstract void draw(int x, int y);

}
