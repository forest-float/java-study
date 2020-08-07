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
 *	SQL数据类型			Java数据类型
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
 * 创建数据库的脚本
 * 
 * @author Administrator
 *
 *-- 创建数据库learjdbc:
	DROP DATABASE IF EXISTS learnjdbc;
	CREATE DATABASE learnjdbc;
	
	-- 创建登录用户learn/口令learnpassword
	CREATE USER IF NOT EXISTS learn@'%' IDENTIFIED BY 'learnpassword';
	GRANT ALL PRIVILEGES ON learnjdbc.* TO learn@'%' WITH GRANT OPTION;
	FLUSH PRIVILEGES;
	
	-- 创建表students:
	USE learnjdbc;
	CREATE TABLE students (
	  id BIGINT AUTO_INCREMENT NOT NULL,
	  name VARCHAR(50) NOT NULL,
	  gender TINYINT(1) NOT NULL,
	  grade INT NOT NULL,
	  score INT NOT NULL,
	  PRIMARY KEY(id)
	) Engine=INNODB DEFAULT CHARSET=UTF8;
	
	-- 插入初始数据:
	INSERT INTO students (name, gender, grade, score) VALUES ('小明', 1, 1, 88);
	INSERT INTO students (name, gender, grade, score) VALUES ('小红', 1, 1, 95);
	INSERT INTO students (name, gender, grade, score) VALUES ('小军', 0, 1, 93);
	INSERT INTO students (name, gender, grade, score) VALUES ('小白', 0, 1, 100);
	INSERT INTO students (name, gender, grade, score) VALUES ('小牛', 1, 2, 96);
	INSERT INTO students (name, gender, grade, score) VALUES ('小兵', 1, 2, 99);
	INSERT INTO students (name, gender, grade, score) VALUES ('小强', 0, 2, 86);
	INSERT INTO students (name, gender, grade, score) VALUES ('小乔', 0, 2, 79);
	INSERT INTO students (name, gender, grade, score) VALUES ('小青', 1, 3, 85);
	INSERT INTO students (name, gender, grade, score) VALUES ('小王', 1, 3, 90);
	INSERT INTO students (name, gender, grade, score) VALUES ('小林', 0, 3, 91);
	INSERT INTO students (name, gender, grade, score) VALUES ('小贝', 0, 3, 77);
 */
public class TestDemo {

	static String JDBC_URL = "jdbc:mysql://localhost:3306/learnjdbc?useSSL=false&characterEncoding=utf8";
	static String JDBC_USER = "root";
	static String JDBC_PASSWORD = "1234567890";
	
	public static void main(String[] args) throws SQLException {
		// TODO 自动生成的方法存根
		// JDBC连接的URL, 不同数据库有不同的格式:

		
		// 获取连接:
		Connection conns = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
		// TODO: 访问数据库...
		// 关闭连接:
		System.out.println(conns);
		conns.close();
		//查询
		//connection需要关闭，所以用try包裹
		try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
			//statement需要关闭，所以用try包裹
			try (Statement stmt = conn.createStatement()) {
				//ResultSet需要关闭，所以用try包裹
				//ResultSet获取列时，索引从1开始而不是0；
				try (ResultSet rs = stmt.executeQuery("SELECT id, grade, name, "
						+ "gender FROM students WHERE gender=1")) {
		            while (rs.next()) {//用于判断是否有下一行记录
		            	//必须根据SELECT的列的对应位置来调用getLong(1)，getString(2)这些方法，
		            	//否则对应位置的数据类型不对，将报错
		                long id = rs.getLong(1); // 注意：索引从1开始
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
		    //要避免SQL注入问题，最好使用PreparedStatement
			try (PreparedStatement ps = conn.prepareStatement("SELECT id, grade, name, gender FROM students WHERE gender=? AND grade=?")) {
		        ps.setObject(1, "M"); // 注意：索引从1开始
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
	    //如果使用Statement拼接字符串，很容易出现SQL注入问题
		//如果用户的输入是一个精心构造的字符串，就可以拼出意想不到的SQL，这个SQL也是正确的，
		//但它查询的条件不是程序设计的意图。例如：name = "bob' OR pass=", pass = " OR pass='"：
		//SELECT * FROM user WHERE login='bob' OR pass=' AND pass=' OR pass=''
		//这个SQL语句执行的时候，根本不用判断口令是否正确，这样一来，登录就形同虚设。
		//要避免SQL注入攻击，一个办法是针对所有字符串参数进行转义，但是转义很麻烦，而且需要在任何使用SQL的地方增加转义代码。
	    String sql = "SELECT * FROM user WHERE login=? AND pass=?";
	    //SQL语句
	    PreparedStatement ps = conn.prepareStatement(sql);
	    ps.setObject(1, name);
	    ps.setObject(2, pass);
	    
	    //PreparedStatement始终使用?作为占位符，并且把数据连同SQL本身传给数据库，这样可以保证每次
	    //传给数据库的SQL语句是相同的，只是占位符的数据不同，还能高效利用数据库本身对查询的缓存
	    
	}

}
