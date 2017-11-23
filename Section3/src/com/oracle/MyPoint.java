package com.oracle;

import java.io.Serializable;
import java.*;
//import java.sql.*;
import static java.lang.System.out;

class XYZ{
}

public class MyPoint implements Serializable {
	java.util.Date d;
	int x;
	int y;
	XYZ zzz;
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
		//zzz = new XYZ();
		out.println("test 12345");
	}
	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	}	
}