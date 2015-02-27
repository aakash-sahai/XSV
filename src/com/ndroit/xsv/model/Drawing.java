/**
 * 
 */
package com.ndroit.xsv.model;

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
	
	
}
