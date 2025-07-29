package com.sidbhujbal.springdemo;

public class long_table implements Table {

	double height;
	double length;
	
	public long_table() {
		this.height=45.5;
		this.length=50.5;
	}
	
	@Override
	public String size_of_table(){
		return "Height of table is" + this.height+ " and length is "+ this.length;
	}

}