package com.nt.dao;
public class Question1{
	private int Qno;
	private String Qname;
	private String Option1;
	private String Option2;
	private String Option3;
	private String Option4;
	private String Answer;
	
	
	public Question1(int qno, String qname, String option1, String option2, String option3, String option4,
			String answer) {
		super();
		Qno = qno;
		Qname = qname;
		Option1 = option1;
		Option2 = option2;
		Option3 = option3;
		Option4 = option4;
		Answer = answer;
	}
	public Question1(String qname, String option1, String option2, String option3, String option4,
			String answer){
		super();
		this.Qname = qname;
		this.Option1 = option1;
		this.Option2 = option2;
		this.Option3 = option3;
		this.Option4 = option4;
		this.Answer = answer;
	}
	public Question1() {
		// TODO Auto-generated constructor stub
	}
	public int getQno() {
		return Qno;
	}
	public void setQno(int qno) {
		Qno = qno;
	}
	public String getQname() {
		return Qname;
	}
	public void setQname(String qname) {
		Qname = qname;
	}
	public String getOption1() {
		return Option1;
	}
	public void setOption1(String option1) {
		Option1 = option1;
	}
	public String getOption2() {
		return Option2;
	}
	public void setOption2(String option2) {
		Option2 = option2;
	}
	public String getOption3() {
		return Option3;
	}
	public void setOption3(String option3) {
		Option3 = option3;
	}
	public String getOption4() {
		return Option4;
	}
	public void setOption4(String option4) {
		Option4 = option4;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	@Override
	public String toString() {
		return "Question1 [Qno=" + Qno + ", Qname=" + Qname + ", Option1=" + Option1 + ", Option2=" + Option2
				+ ", Option3=" + Option3 + ", Option4=" + Option4 + ", Answer=" + Answer + "]";
	}

	
}