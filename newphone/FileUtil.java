package kosta.newphone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
	public static List<PhoneInfo> readFile(File file) throws IOException {
		FileReader filereader = null;
		List<PhoneInfo> InfoList = new ArrayList<PhoneInfo>();

		try {
			filereader = new FileReader(file);
			// ���Ͽ��� �о�� ������ List�� �����Ѵ�.
			InfoList = readReader(filereader);
		} finally {
			if (filereader != null)
				filereader.close();
		}
		return InfoList;
	}

	public static void writeFile(String dir, String name, List<PhoneInfo> InfoList) throws IOException {
		OutputStream out = null;
		try {
			File dirent = new File(dir);

			// ������ ���丮�� �������� ������ ����
			if (!dirent.exists()) {
				dirent.mkdir();
			}

			File outFile = new File(dir, name);

			// ������ �����Ѵٸ� �����Ѵ�.
			if (outFile.exists()) {
				outFile.delete();
			}

			// ���Ͽ� String���� �Է��� BufferedOutputStream ����
			out = new BufferedOutputStream(new FileOutputStream(outFile));
			for (int idx = 0; idx < InfoList.size(); idx++) {
				// List���� ���������� �����´�.
				String writeStr = InfoList.get(idx).getName() + "," + InfoList.get(idx).getPhoneNo() + ","
						+ InfoList.get(idx).getBirth() + "\n";

				// ������ string���� Byte �迭�� ����
				byte[] b = writeStr.getBytes();

				// ���Ͽ� �ش� ������ ����.
				out.write(b);
			}
		} catch (IOException ioe) {
			// ����¿��� ���ܹ߻��� ���� ���� ���
			ioe.printStackTrace();
			throw ioe;
		} finally {
			try {
				// BufferdOutputStream ��ü�� close���ش�.
				if (out != null)
					out.close();
			} catch (Exception e) {
			}
		}
	}

	public static List<PhoneInfo> readReader(Reader input) throws IOException {
		try {
			// ������ ������ �о���� BufferReader ��ü ����
			BufferedReader in = new BufferedReader(input);
			String line;

			List<PhoneInfo> InfoList = new ArrayList<PhoneInfo>();

			// ������ ���پ� �о��.
			while ((line = in.readLine()) != null) {
				// ","�� split�Ͽ� �迭�� ����
				String[] writeStr = line.split(",");

				// ��� ������ ����Ǿ� ���� �ʴٸ� skip�Ѵ�.
				if (writeStr.length != 6)
					continue;

				PhoneInfo pi = new PhoneInfo();

				// �� ���������� �����Ѵ�.

				pi.setName(writeStr[0]);

				pi.setPhoneNo(writeStr[1]);
				pi.setBirth(writeStr[1]);
				// ����Ʈ�� ��ü �߰�.
				InfoList.add(pi);
			}

			return InfoList;
		} finally {
			input.close();
		}
	}
}
