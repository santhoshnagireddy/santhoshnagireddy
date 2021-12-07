package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoClass {

	public static Connection getcon() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/santu", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public boolean addUser(User user) {
		boolean b = false;
		Connection con = getcon();
		try {
			PreparedStatement pst = con.prepareStatement(
					"insert into User(uname,upass,contactno,email,gender,address) values(?,?,?,?,?,?)");

			pst.setString(1, user.getUname());
			pst.setString(2, user.getUpass());
			pst.setString(3, user.getContactno());
			pst.setString(4, user.getEmail());
			pst.setString(5, user.getGender());
			pst.setString(6, user.getAddress());

			int res = pst.executeUpdate();
			if (res > 0) {
				b = true;

			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return b;

	}
	
	public boolean addQuestion(Question1 user) {
		boolean b = false;
		Connection con = getcon();
		try {
			PreparedStatement pst = con.prepareStatement(
					"insert into question(Qname,Option1,Option2,Option3,Option4,Answer) values(?,?,?,?,?,?)");

			pst.setString(1, user.getQname());
			pst.setString(2, user.getOption1());
			pst.setString(3, user.getOption2());
			pst.setString(4, user.getOption3());
			pst.setString(5, user.getOption4());
			pst.setString(6, user.getAnswer());

			int res = pst.executeUpdate();
			if (res > 0) {
				b = true;

			}
		} catch (Exception e) {
			System.out.println(e);

		}
		return b;

	}


	public List<Question1> listusers() {
		List<Question1> ls = new ArrayList<Question1>();
		Connection con = getcon();
		try {
			PreparedStatement pst = con.prepareStatement("select * from question");
			ResultSet res = pst.executeQuery();
			while (res.next()) {
				Question1 u = new Question1();
				u.setQno(res.getInt(1));
				u.setQname(res.getString(2));
				u.setOption1(res.getString(3));
				u.setOption2(res.getString(4));
				u.setOption3(res.getString(5));
				u.setOption4(res.getString(6));
				u.setAnswer(res.getString(7));
				
				ls.add(u);
			}

			

		} catch (Exception e) {
			System.out.println(e);
		}
		return ls;
		
	}
	public boolean validateUser(String uname,String upass) throws SQLException {
		boolean b = false;
		
		Connection con = getcon();
		PreparedStatement pst = con.prepareStatement("select * from User where uname = ? and upass = ?");
		pst.setString(1, uname);
		pst.setString(2, upass);
		ResultSet res = pst.executeQuery();
		if(res.next()) {
			b = true;
		}
		return b;
	}
	
	public boolean validateAdmin(String uname,String upass) throws SQLException {
		boolean b = false;
		
		Connection con = getcon();
		PreparedStatement pst = con.prepareStatement("select * from admin where username = ? and password = ?");
		pst.setString(1, uname);
		pst.setString(2, upass);
		ResultSet res = pst.executeQuery();
		if(res.next()) {
			b = true;
		}
		return b;
	}

	 

	
}
