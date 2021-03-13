package kosta.api;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class StringExam {

	public static void main(String[] args) {

		String str = "abc";
		String str2 = new String("abc");
		String sql = "select * from board where num";

		String str3 = str.concat(str2);
		System.out.println(str3);// ���ڿ��� �Һ���.
		// ����ȯ�����ν� ���Ҽ����� �ڱ��ڽ� ��ü�� ����ȹٲ�

		StringBuffer sb = new StringBuffer("������");
		sb.append("�󸶹�");
		System.out.println(sb);

		// �ش� ���ڿ��� ��ġ�� �ľӤ� indexof("���ڿ�") ����(0) ������(-1)
		System.out.println(sql.indexOf("$"));
		System.out.println(sql.length());
		// ���� �߿��Ѱ� : ���ڿ� �κ����� ->substring(5) 6��°���ͽϴ�
		// substring(5,10) �������� �ε����δ� 4����9
// board �ε�����ġ 14 18�ε� ���ڿ� ��������� 14 19	
		// �� (a,b)=>a ���� b��ĭ��������� �����ϸ餤��.

		System.out.println(sql.substring(3, 5));
		System.out.println(sql.indexOf("b"));
		System.out.println(sql.indexOf("d"));
		System.out.println(sql.substring(14, 19));

		System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board") + 5));

		String fileName = "kosta.jpg";
		String head = "";
		String pattern = "";

		head = fileName.substring(0, fileName.indexOf("."));
		pattern = fileName.substring(fileName.indexOf(".") + 1, fileName.length());
		System.out.println(head + " : " + pattern);

		String id = "kosta";
		String m_id = "kosta ";// ���鹮��

		if (id.equalsIgnoreCase(m_id.trim())) {// trim �յڰ��鹮������
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
//equalsIgnoreCase ��ҹ��� �뱸��
		// ���ڿ� => �迭��ȯ
		String fruits = "��� �� ���� ����";
		String arr[] = fruits.split(" ");
		// split�� ���� ¥����
		System.out.println(Arrays.toString(arr));

		// startWith(), endsWith() : �ش� ���ڿ� ����/���� �ϴ� üũ
		// �̹��� ����(jpg [png gif)������ üũ�ϰٴ�.
		// �̷����� Ȯ���� ã�¿�

		if (fileName.endsWith("jpg") || fileName.endsWith("png") || fileName.endsWith("gif"))
			System.out.println("�̹�������");

		String path = "C:\\Users\\KOSTA\\Downloads\\�߰��׽�Ʈ.jpg";
		// String result = "";//kosta_small.jpg
		String fileName2 = path.substring(0, path.indexOf("."));
		String pattern2 = path.substring(path.indexOf(".") + 1, path.length());

		System.out.println(pattern2);
		String result = fileName2 + "_small" + pattern2;
		System.out.println(result);

		int n =10;
		String a= n+"";
		System.out.println(n+a);
		
//		GregorianCalendar ac = new GregorianCalendar();
		Calendar gc = new Calendar.getInstance();
		
		String now = gc.get(Calendar.YEAR)+ "��"
					+(gc.get(Calendar.MONTH)+1)+"��"
					+(gc.get(Calendar.DATE))+"��"
					+(gc.get(Calendar.HOUR))+"��"
					+(gc.get(Calendar.MINUTE))+"��";
		System.out.println("100���� "+ now);
		
		gc.set(2020,11,25);
		gc.add(Calendar.DATE,100);
		
		SimpleDateFormat dataFormat =
				new SimpleDateFormat("yyyy-MM-dd hh:mm");
		String str1 = dataFormat.format(gc.getTime());
		System.out.println(str1);
					
					
			
		//datoftear�� Ȱ���� �ų� ��������ϱ�
		char[] week = {'��', '��','ȭ', '��','��','��', '��'};
		
		for(int i = 2021;i<=2030;i++) {
			gc.set(i, i, 2);
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
			System.out.println(i+ "year"+ c+"day");
		}
			
		
					
	}
}
