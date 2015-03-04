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
public class Netlist {

	private List<Signal> signals;
	private List<Port> ports;
	private List<Blockdef> blockdefs;
	private List<Block> blocks;
	
	public Netlist() {
		super();
		this.signals = new ArrayList<Signal>();
		this.ports = new ArrayList<Port>();
		this.blockdefs = new ArrayList<Blockdef>();
		this.blocks = new ArrayList<Block>();
	}
	
	
	public static Netlist parse(Element el) throws Exception {
		Netlist netlist = new Netlist();
		Elements children = el.getChildElements();
		for (int i = 0; i < children.size(); i++) {
            Element c = children.get(i);
            String cname = c.getLocalName();
            if (cname.equals("signal")) {
            	netlist.signals.add(Signal.parse(c));
            } else if (cname.equals("port")) {
            	netlist.ports.add(Port.parse(c));
            } else if (cname.equals("blockdef")) {
            	netlist.blockdefs.add(Blockdef.parse(c));
            } else if (cname.equals("block")) {
            	netlist.blocks.add(Block.parse(c));
            } else {
            	throw new Exception("Unknown child element under <netlist>: " + cname);	
            }
		}
		return netlist;
	}
	
}
