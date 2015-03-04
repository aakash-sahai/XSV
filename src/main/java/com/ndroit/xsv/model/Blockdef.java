/**
 * 
 */
package com.ndroit.xsv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import nu.xom.Element;
import nu.xom.Elements;

/**
 * @author Aakash Sahai
 *
 */
public class Blockdef extends Figure {

	private String name;
	private String timestamp;
	private List<Geometry> geometries;
	
	/**
	 * 
	 */
	public Blockdef() {
		this.geometries = new ArrayList<Geometry>();
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
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public static Blockdef parse(Element el) throws Exception {
		Blockdef block = new Blockdef();
		block.name = el.getAttributeValue("name");

		Elements children = el.getChildElements();
		for (int i = 0; i < children.size(); i++) {
            Element c = children.get(i);
            String cname = c.getLocalName();
            if (cname.equals("line")) {
            	block.geometries.add(Line.parse(c));
            } else if (cname.equals("rect")) {
                block.geometries.add(Rect.parse(c));
            } else if (cname.equals("timestamp")) {
            	block.timestamp = c.getValue();
            } else {
            	throw new Exception("Unknown child element under <Blockdef>: " + cname);	
            }
		}
		return block;
	}
}
