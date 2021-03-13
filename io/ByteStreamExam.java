package kosta.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteStreamExam {

	public static void main(String[] args) {

		
		byte[] in = {0,1,2,3,4,5,6,7,8,9};
		byte[] out = null;
		
		ByteArrayInputStream  input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(in);
		output = new ByteArrayOutputStream();
		
		int data= 0;
		
		while ((data = input.read())!=-1)
			output.write(data);
		
		out = output.toByteArray();
		
		System.out.println(Arrays.toString(in));
		System.out.println(Arrays.toString(out));
	}

}
