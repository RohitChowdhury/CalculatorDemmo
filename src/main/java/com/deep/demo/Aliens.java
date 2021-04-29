package com.deep.demo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Aliens {

	private String mame;
	private int points;
	public String getMame() {
		return mame;
	}
	public void setMame(String mame) {
		this.mame = mame;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
}
