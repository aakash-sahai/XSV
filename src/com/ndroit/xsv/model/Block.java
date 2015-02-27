/**
 * 
 */

package com.ndroit.xsv.model;

import java.util.List;

/**
 * @author Aakash Sahai
 *
 */
public class Block {
	private String name;	
	private String symbolname;
	private List<Blockpin> blockpins;
	
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
	 * @return the symbolname
	 */
	public String getSymbolname() {
		return symbolname;
	}
	/**
	 * @param symbolname the symbolname to set
	 */
	public void setSymbolname(String symbolname) {
		this.symbolname = symbolname;
	}
	/**
	 * @return the blockpins
	 */
	public List<Blockpin> getBlockpins() {
		return blockpins;
	}
	/**
	 * @param blockpins the blockpins to set
	 */
	public void setBlockpins(List<Blockpin> blockpins) {
		this.blockpins = blockpins;
	}
	
}
