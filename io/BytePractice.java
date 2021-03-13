package kosta.io;

import java.io.*;
import java.util.Arrays;

public class BytePractice {

	public static void main(String[] args) {

		byte[] in = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		byte[] out = null;
		byte[] temp = new byte[4];

		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;

		input = new ByteArrayInputStream(in);
		output = new ByteArrayOutputStream();

		System.out.println("input source" + Arrays.toString(in));
		try {
			while (input.available() > 0) {
				input.read(temp);
				output.write(temp);
				out = output.toByteArray();
				printArrays(temp, out);

			}

		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		} finally {
			try {
				input.close();
				output.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

	private static void printArrays(byte[] temp, byte[] out) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(out));
		
	}

}
