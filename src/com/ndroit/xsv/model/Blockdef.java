/**
 * 
 */
package com.ndroit.xsv.model;

import java.util.Date;

/**
 * @author Aakash Sahai
 *
 */
public class Blockdef extends Figure {

	private String name;
	private Date timestamp;
	
	/**
	 * 
	 */
	public Blockdef() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.ndroit.xsv.model.Figure#draw(int, int)
	 */
	@Override
	public void draw(int x, int y) {
		// TODO Auto-generated method stub

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
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}
