package kosta.interf;

import kosta.dao.MysqlDao;
import kosta.dao.OracleDao;

public class Main {

	public static void main(String[] args) {

		Object obj[] = { new Reader("�Ѹ�"), new Work("�浿"), new Student("������") };

		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Speakable) {
//				Man m = new Man();
//				Reader r = new Reader();
//				Work w = new Work();
				Speakable sp = (Speakable) obj[i];//////
				sp.speak();///////////

			}
		}
	}
}
