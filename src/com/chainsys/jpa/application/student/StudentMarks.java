package com.chainsys.jpa.application.student;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_marks")
public class StudentMarks {
	@Id
	@Column(name = "register_number")
	private int id;
	@Column(name = "student_name")
	private String name;
	@Column(name = "date_of_birth")
	private Date dob;
	@Column(name = "tamil")
	private String tamil;
	@Column(name = "english")
	private String english;
	@Column(name = "maths")
	private String maths;
	@Column(name = "science")
	private String science;
	@Column(name = "social")
	private String social;
	@Column(name = "total")
	private String total;

	public int getRegisterNumber() {
		return id;
	}

	public void setRegisterName(int registerName) {
		this.id = registerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getTamil() {
		return tamil;
	}

	public void setTamil(String tamil) {
		this.tamil = tamil;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public String getMaths() {
		return maths;
	}

	public void setMaths(String maths) {
		this.maths = maths;
	}

	public String getScience() {
		return science;
	}

	public void setScience(String science) {
		this.science = science;
	}

	public String getSocial() {
		return social;
	}

	public void setSocial(String social) {
		this.social = social;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return String.format("%d,%s,%s,%d,%d,%d,%d,%d,%d", id, name, dob, tamil, english, maths, science, social,
				total);
	}
}