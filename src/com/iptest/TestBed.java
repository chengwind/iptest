package com.iptest;

public class TestBed {

	public static void main(String[] args) {
		String ip ="58.213.19.134";
		IPSeeker ips = IPSeeker.getInstance();
		System.out.println(ips.getAddress(ip));
		System.out.println(ips.getArea(ip));
		System.out.println(ips.getCountry(ip));
		System.out.println(ips.getIPEntries("½­"));

	}

}
