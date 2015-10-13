/**
 * @autor pathmasri
 * Oct 13, 2015 10:44:29 PM
 */
package com.sharpersharp.golf;

import java.util.ArrayList;

public class Donor {
	
	private String name;
	private ArrayList<String> stars = new ArrayList<String>();
	
	
	
	/**
	 * @param name
	 * @param stars
	 */
	public Donor(String name, ArrayList<String> stars) {
		super();
		this.name = name;
		this.stars = stars;
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
	 * @return the stars
	 */
	public ArrayList<String> getStars() {
		return stars;
	}
	/**
	 * @param stars the stars to set
	 */
	public void setStars(ArrayList<String> stars) {
		this.stars = stars;
	}
	
	

}
