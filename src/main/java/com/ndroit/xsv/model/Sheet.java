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
public class Sheet {

	private int sheetnum;
	private int width;
	private int height;
	
	private List<Branch> branches;
	private List<Iomarker> iomarkers;
	private List<Instance> instances;
	private List<Text> texts;
	
	public Sheet() {
		super();
		this.branches = new ArrayList<Branch>();
		this.iomarkers = new ArrayList<Iomarker>();
		this.instances = new ArrayList<Instance>();
		this.texts = new ArrayList<Text>();
	}
	
	/**
	 * @return the version
	 */
	public int getVersion() {
		return sheetnum;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.sheetnum = version;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the branches
	 */
	public List<Branch> getBranches() {
		return branches;
	}

	/**
	 * @param branches the branches to set
	 */
	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

	/**
	 * @return the iomarkers
	 */
	public List<Iomarker> getIomarkers() {
		return iomarkers;
	}

	/**
	 * @param iomarkers the iomarkers to set
	 */
	public void setIomarkers(List<Iomarker> iomarkers) {
		this.iomarkers = iomarkers;
	}

	/**
	 * @return the instances
	 */
	public List<Instance> getInstances() {
		return instances;
	}

	/**
	 * @param instances the instances to set
	 */
	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	/**
	 * @return the texts
	 */
	public List<Text> getTexts() {
		return texts;
	}

	/**
	 * @param texts the texts to set
	 */
	public void setTexts(List<Text> texts) {
		this.texts = texts;
	}

	public static Sheet parse(Element el) throws Exception {
		Sheet sheet = new Sheet();
		sheet.sheetnum = Integer.parseInt(el.getAttributeValue("sheetnum"));
		sheet.width = Integer.parseInt(el.getAttributeValue("width"));
		sheet.height = Integer.parseInt(el.getAttributeValue("height"));
		Elements children = el.getChildElements();
		for (int i = 0; i < children.size(); i++) {
            Element c = children.get(i);
            String cname = c.getLocalName();
            if (cname.equals("branch")) {
            	sheet.branches.add(Branch.parse(c));
            } else if (cname.equals("iomarker")) {
            	sheet.iomarkers.add(Iomarker.parse(c));
            } else if (cname.equals("instance")) {
            	sheet.instances.add(Instance.parse(c));
            } else if (cname.equals("text")) {
            	sheet.texts.add(Text.parse(c));
            } else {
            	throw new Exception("Unknown child element under <sheet>: " + cname);	
            }
		}
		return sheet;
	}
	
}
