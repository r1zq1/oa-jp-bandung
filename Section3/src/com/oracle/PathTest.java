package com.oracle;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
	public static void main(String[] args) {
		Path p = Paths.get("D:\\Workspace\\changes.txt");
		System.out.println(p.getFileName());
		System.out.println(p.getParent());
		System.out.println(p.getRoot());
		System.out.println(p.isAbsolute());
		System.out.println(p.toUri());
		System.out.println(p.toAbsolutePath());
		
		Path p1 = Paths.get("C:/blueJ/data/Notes/backup.dat");
		Path p2 = Paths.get("C:/blueJ/data");
		Path p3 = p2.relativize(p1);
		System.out.println(p3);
		
		Path bp = Paths.get("C:/BlueJ"); 
		Path np = Paths.get("NIO2/Path"); 
		//Add a path not found in it. 
		Path bp2 = bp.resolve(np.toString()); 
		//Remove a path found in it. 
		Path np2 = np.resolve(bp.toString()); 
		//display the resulting paths to the console. 
		System.out.println(bp2.toString()); 
		System.out.println(np2.toString());
	}
}