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
public class Drawing {

	private int version;
	private Sheet sheet;
	private Attr attr;
	private Netlist netlist;
	
	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}
	/**
	 * @return the sheet
	 */
	public Sheet getSheet() {
		return sheet;
	}
	/**
	 * @param sheet the sheet to set
	 */
	public void setSheet(Sheet sheet) {
		this.sheet = sheet;
	}
	/**
	 * @return the attr
	 */
	public Attr getAttr() {
		return attr;
	}
	/**
	 * @param attr the attr to set
	 */
	public void setAttr(Attr attr) {
		this.attr = attr;
	}
	/**
	 * @return the netlist
	 */
	public Netlist getNetlist() {
		return netlist;
	}
	/**
	 * @param netlist the netlist to set
	 */
	public void setNetlist(Netlist netlist) {
		this.netlist = netlist;
	}
	
	public static Drawing parse(Element el) throws Exception {
		Drawing drawing = new Drawing();
		drawing.version = Integer.parseInt(el.getAttributeValue("version"));
		Elements children = el.getChildElements();
		for (int i = 0; i < children.size(); i++) {
            Element c = children.get(i);
            String cname = c.getLocalName();
            if (cname.equals("sheet")) {
            	drawing.sheet = Sheet.parse(c);
            } else if (cname.equals("netlist")) {
            	drawing.netlist = Netlist.parse(c);
            } else if (cname.equals("attr")) {
            	drawing.attr = Attr.parse(c);
            } else {
            	throw new Exception("Unknown child element under <drawing>: " + cname);	
            }
		}
		return drawing;
	}
	
}
