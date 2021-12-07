package com.nt.dao;

public class User {
private int uid;
private String uname;;
private String upass;
private String contactno;
private String email;
private String gender;;
private String address;

public User(String uname, String upass, String contactno, String gender,String email, String address) {
	super();
	this.uname = uname;
	this.upass = upass;
	this.contactno = contactno;
	this.gender = gender;
	this.email = email;
	this.address = address;
}

public User() {
	// TODO Auto-generated constructor stub
}

public int getUid() {
	return uid;
}

public void setUid(int uid) {
	this.uid = uid;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getUpass() {
	return upass;
}

public void setUpass(String upass) {
	this.upass = upass;
}

public String getContactno() {
	return contactno;
}

public void setContactno(String contactno) {
	this.contactno = contactno;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "User [uid=" + uid + ", uname=" + uname + ", upass=" + upass + ", contactno=" + contactno + ", email="
			+ email + ", gender=" + gender + ", address=" + address + "]";
}


}