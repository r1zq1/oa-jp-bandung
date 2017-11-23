package com.oracle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyPointSerializationTest {
	public static void main(String[] args) 
			throws IOException, ClassNotFoundException {
		// Serialization
		MyPoint p = new MyPoint(4, 8);
		FileOutputStream fos = new FileOutputStream("mypoint.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
		fos.close();
		// De-Serialization
		FileInputStream fis = new FileInputStream("mypoint.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		MyPoint mp = (MyPoint)o;
		System.out.println(mp);
		ois.close();
		fis.close();
	}
}