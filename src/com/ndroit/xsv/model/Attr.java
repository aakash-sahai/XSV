/**
 * 
 */

package com.ndroit.xsv.model;

import java.util.List;

/**
 * @author Aakash Sahai
 *
 */
public class Attr {
	private String name;	
	private String value;
	private List<Trait> traits;
	
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
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the traits
	 */
	public List<Trait> getTraits() {
		return traits;
	}
	/**
	 * @param traits the traits to set
	 */
	public void setTraits(List<Trait> traits) {
		this.traits = traits;
	}
	
}
