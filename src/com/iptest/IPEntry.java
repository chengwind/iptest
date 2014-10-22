package com.iptest;

public class IPEntry {
	public String beginIp;
	public String endIp;
	public String country;
	public String area;

	/**
	 * ¹¹Ôìº¯Êý
	 */

	public IPEntry() {
		beginIp = endIp = country = area = "";
	}

	public String toString() {
		return this.area + "  " + this.country + "IP·¶Î§:" + this.beginIp + "-"
				+ this.endIp;
	}
}
