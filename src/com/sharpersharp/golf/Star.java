/**
 * @autor pathmasri
 * Oct 13, 2015 10:44:15 PM
 */
package com.sharpersharp.golf;

public class Star {
	
	private String name;
	private int count;
	
	
	/**
	 * @param name
	 * @param count
	 */
	public Star(String name, int count) {
		super();
		this.name = name;
		this.count = count;
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
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
	

}
