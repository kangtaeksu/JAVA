package kosta.io;

import java.io.File;

public class Mission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String source = "C:\\Users\\KOSTA\\Downloads\\±≥¿ÁPPT";
		String dest = "C:\\Users\\KOSTA\\newDirec";

	try {
		CopyUtil.copyFile(new File(source), new File(dest));
	} catch (Exception e) {
		e.printStackTrace();// TODO: handle exception
	}
		
	}

}
