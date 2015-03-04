/**
 * 
 */

package com.ndroit.xsv.model;

import java.util.ArrayList;
import java.util.List;

import nu.xom.Element;
import nu.xom.Elements;

/**
 * @author Aakash Sahai
 *
 */
public class Block {
	private String name;	
	private String symbolname;
	private List<Blockpin> blockpins;
	
	public Block() {
		super();
		this.blockpins = new ArrayList<Blockpin>();
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
	
	public static Block parse(Element el) throws Exception {
		Block block = new Block();
		block.symbolname = el.getAttributeValue("symbolname");
		block.name = el.getAttributeValue("name");
		Elements children = el.getChildElements();
		for (int i = 0; i < children.size(); i++) {
            Element c = children.get(i);
            String cname = c.getLocalName();
            if (cname.equals("blockpin")) {
            	block.blockpins.add(Blockpin.parse(c));
            } else {
            	throw new Exception("Unknown child element under <Block>: " + cname);	
            }
		}
		return block;
	}
	
}
