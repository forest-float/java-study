package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * 
 * @author Administrator
 *	SQL��������			Java��������
	BIT, BOOL			boolean
	INTEGER				int
	BIGINT				long
	REAL				float
	FLOAT, DOUBLE		double
	CHAR, VARCHAR		String
	DECIMAL				BigDecimal
	DATE				java.sql.Date, LocalDate
	TIME				java.sql.Time, LocalTime
 */

/**
 * �������ݿ�Ľű�
 * 
 * @author Administrator
 *
 *-- �������ݿ�learjdbc:
	DROP DATABASE IF EXISTS learnjdbc;
	CREATE DATABASE learnjdbc;
	
	-- ������¼�û�learn/����learnpassword
	CREATE USER IF NOT EXISTS learn@'%' IDENTIFIED BY 'learnpassword';
	GRANT ALL PRIVILEGES ON learnjdbc.* TO learn@'%' WITH GRANT OPTION;
	FLUSH PRIVILEGES;
	
	-- ������students:
	USE learnjdbc;
	CREATE TABLE students (
	  id BIGINT AUTO_INCREMENT NOT NULL,
	  name VARCHAR(50) NOT NULL,
	  gender TINYINT(1) NOT NULL,
	  grade INT NOT NULL,
	  score INT NOT NULL,
	  PRIMARY KEY(id)
	) Engine=INNODB DEFAULT CHARSET=UTF8;
	
	-- �����ʼ����:
	INSERT INTO students (name, gender, grade, score) VALUES ('С��', 1, 1, 88);
	INSERT INTO students (name, gender, grade, score) VALUES ('С��', 1, 1, 95);
	INSERT INTO students (name, gender, grade, score) VALUES ('С��', 0, 1, 93);
	INSERT INTO students (name, gender, grade, score) VALUES ('С��', 0, 1, 100);
	INSERT INTO students (name, gender, grade, score) VALUES ('Сţ', 1, 2, 96);
	INSERT INTO students (name, gender, grade, score) VALUES ('С��', 1, 2, 99);
	INSERT INTO students (name, gender, grade, score) VALUES ('Сǿ', 0, 2, 86);
	INSERT INTO students (name, gender, grade, score) VALUES ('С��', 0, 2, 79);
	INSERT INTO students (name, gender, grade, score) VALUES ('С��', 1, 3, 85);
	INSERT INTO students (name, gender, grade, score) VALUES ('С��', 1, 3, 90);
	INSERT INTO students (name, gender, grade, score) VALUES ('С��', 0, 3, 91);
	INSERT INTO students (name, gender, grade, score) VALUES ('С��', 0, 3, 77);
 */
public class TestDemo {

	static String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc?useSSL=false&characterEncoding=utf8";
	static String JDBC_USER = "root";
	static String JDBC_PASSWORD = "1234567890";
	
	public static void main(String[] args) throws SQLException {
		// TODO �Զ����ɵķ������
		// JDBC���ӵ�URL, ��ͬ���ݿ��в�ͬ�ĸ�ʽ:

		
		// ��ȡ����:
		Connection conns = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		// TODO: �������ݿ�...
		// �ر�����:
		System.out.println(conns);
		conns.close();
		//��ѯ
		//connection��Ҫ�رգ�������try����
		try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
			//statement��Ҫ�رգ�������try����
			try (Statement stmt = conn.createStatement()) {
				//ResultSet��Ҫ�رգ�������try����
				//ResultSet��ȡ��ʱ��������1��ʼ������0��
				try (ResultSet rs = stmt.executeQuery("SELECT id, grade, name, "
						+ "gender FROM students WHERE gender=1")) {
		            while (rs.next()) {//�����ж��Ƿ�����һ�м�¼
		            	//�������SELECT���еĶ�Ӧλ��������getLong(1)��getString(2)��Щ������
		            	//�����Ӧλ�õ��������Ͳ��ԣ�������
		                long id = rs.getLong(1); // ע�⣺������1��ʼ
		                long grade = rs.getLong(2);
		                String name = rs.getString(3);
		                int gender = rs.getInt(4);
		                System.out.println(id + " " + grade + " " + name + " " + gender);
		            }
		        }
		    }
		}
		System.out.println();
		try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
		    //Ҫ����SQLע�����⣬���ʹ��PreparedStatement
			try (PreparedStatement ps = conn.prepareStatement("SELECT id, grade, name, gender FROM students WHERE gender=? AND grade=?")) {
		        ps.setObject(1, "M"); // ע�⣺������1��ʼ
		        ps.setObject(2, 3);
		        try (ResultSet rs = ps.executeQuery()) {
		            while (rs.next()) {
		                long id = rs.getLong("id");
		                long grade = rs.getLong("grade");
		                String name = rs.getString("name");
		                String gender = rs.getString("gender");
		                System.out.println(id + " " + grade + " " + name + " " + gender);
		            }
		        }
		    }
		}
	}
	
	void UserLogin(String name, String pass) throws SQLException {
		Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	    //Statement stmt = conn.createStatement();
	    //stmt.executeQuery("SELECT * FROM user WHERE login='" + name + "' AND pass='" + pass + "'");
	    //���ʹ��Statementƴ���ַ����������׳���SQLע������
		//����û���������һ�����Ĺ�����ַ������Ϳ���ƴ�����벻����SQL�����SQLҲ����ȷ�ģ�
		//������ѯ���������ǳ�����Ƶ���ͼ�����磺name = "bob' OR pass=", pass = " OR pass='"��
		//SELECT * FROM user WHERE login='bob' OR pass=' AND pass=' OR pass=''
		//���SQL���ִ�е�ʱ�򣬸��������жϿ����Ƿ���ȷ������һ������¼����ͬ���衣
		//Ҫ����SQLע�빥����һ���취����������ַ�����������ת�壬����ת����鷳��������Ҫ���κ�ʹ��SQL�ĵط�����ת����롣
	    String sql = "SELECT * FROM user WHERE login=? AND pass=?";
	    //SQL���
	    PreparedStatement ps = conn.prepareStatement(sql);
	    ps.setObject(1, name);
	    ps.setObject(2, pass);
	    
	    //PreparedStatementʼ��ʹ��?��Ϊռλ�������Ұ�������ͬSQL���������ݿ⣬�������Ա�֤ÿ��
	    //�������ݿ��SQL�������ͬ�ģ�ֻ��ռλ�������ݲ�ͬ�����ܸ�Ч�������ݿⱾ��Բ�ѯ�Ļ���
	    
	}

}
