package lar4;
import java.io.*;


public class Test {

	public static void main(String[] args) {

		File sourceFile = new File();
		File targetFile = new File();

		String s = "";

		try {
			Reader in = new FileReader(sourceFile);

			BufferedReader bufferReader = new BufferedReader(in);

			Writer out = new FileWriter(targetFile, true);

			BufferedWriter bufferWriter = new BufferedWriter(out);

			String information = "" + student.getName() + "		" + "" + student.getSex() + "		" + ""
					+ student.getAge() + "		" + "" + student.getNumber();
	
			bufferWriter.write(information);
		
			bufferWriter.newLine();

			String str = null;
	
			while ((str = bufferReader.readLine()) != null) {
				s = s + str;
			}

			char strone[] = new char[s.length()];

			strone = s.toCharArray();

			for (int i = 1; i <= s.length(); i++) {
				bufferWriter.write(strone[i - 1]);
				if (i % 14 == 0) {
					bufferWriter.write("");
					bufferWriter.newLine();
				} else if (i % 7 == 0) {
					bufferWriter.write(",");
				}
			}
			bufferWriter.flush();
			bufferWriter.flush();
			bufferWriter.close();
			bufferReader.close();


