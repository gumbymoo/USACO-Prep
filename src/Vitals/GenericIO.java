package Vitals;

import java.io.*;
import java.util.*;

public class GenericIO {
	
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(
				new FileReader("C:\\Users\\Jas12840\\eclipse-workspace\\USACO2020\\src\\Vitals\\test.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(
				new FileWriter("C:\\Users\\Jas12840\\eclipse-workspace\\USACO2020\\src\\Vitals\\test.out")));
		
		StringTokenizer st = new StringTokenizer(r.readLine());
		
		//Use st.nextToken() to read next string up to whitespace
		//Need st = new StringTokenizer(r.readLine()); between each line you readu
		
		r.close();
		pw.close();
		
	}

}
