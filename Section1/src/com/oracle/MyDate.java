package com.oracle;

public class MyDate {
	private int day;
	private int month;
	private int year;	
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		if(obj != null && obj instanceof MyDate) {
			MyDate md = (MyDate)obj;
			if(md.day == day && md.month == month 
					&& md.year == year) {
				res = true;
			}
		}
		return res;
	}
}