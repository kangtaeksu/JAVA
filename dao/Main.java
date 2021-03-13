package kosta.dao;

import kosta.inner.MessageSender;
import kosta.inner.SNSmessenger;
import kosta.oop3.Person;
import kosta.oop3.Study2;
import kosta.oop3.Work2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MysqlDao s = new MysqlDao();
		OracleDao w = new OracleDao();
//		==> Dao OracleDao = new OracleDao();
		Service p = new Service(s);
		p.insertService();

		Dao msSQLDao = new Dao() {

			@Override
			public void insert() {
				// TODO Auto-generated method stub
				System.out.println(" SQL");
			}
		};

		Service service = new Service(msSQLDao);
		service.insertService();

	}

}
