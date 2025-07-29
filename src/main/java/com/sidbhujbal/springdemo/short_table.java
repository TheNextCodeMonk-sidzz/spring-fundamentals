package com.sidbhujbal.springdemo;

public class short_table implements Table {
	
	double height;
	double length;
	
	public short_table() {
		this.height=15.5;
		this.length=20.5;
	}
	
	@Override
	public String size_of_table() {
		return "Height of table is" + this.height+ " and length is "+ this.length;

	}

}
