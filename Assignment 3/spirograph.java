import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

class spirograph {
	public static void main(String args[]) {
		double R = 8.0, r = 1.0, a = 4.0, x0 = R + r - a, y0 = 0, pi = Math.PI;
		int nRev = 16;
	try {

		 PrintStream out = new PrintStream(new FileOutputStream("OutFile.txt"));
		for(double t = 0.0; t < (pi*nRev); t+=0.01) {
			double x = (R+r)*Math.cos((r/R)*t) - a*Math.cos((1+r/R)*t);
			double y = (R+r)*Math.sin((r/R)*t) - a*Math.sin((1+r/R)*t);
			double c1 = -118.28915489;
			double c2 = 34.0212409;
			out.print(x+c1+",");
			out.println(y+c2+",0");
	    		}
        out.close();
 	} catch (FileNotFoundException e) {
      		e.printStackTrace();
    		}
	}
}