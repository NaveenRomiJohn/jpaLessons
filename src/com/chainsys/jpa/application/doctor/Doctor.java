package com.chainsys.jpa.application.doctor;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Doctor")
public class Doctor {
	@Id
	@Column(name = "doctor_id")
	private int id;
	@Column(name = "doctor_name")
	private String doctorName;
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	private String speciality;
	private String city;
	@Column(name = "phone_number")
	private long phoneNumber;
	private float fees;

	public int getDoctor_id() {
		return id;
	}

	public void setDoctor_id(int doctor_id) {
		this.id = doctor_id;
	}

	public String getName() {
		return doctorName;
	}

	public void setName(String name) {
		this.doctorName = name;
	}

	public Date getDob() {
		return dateOfBirth;
	}

	public void setDob(Date dob) {
		this.dateOfBirth = dob;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhone_number() {
		return phoneNumber;
	}

	public void setPhone_number(long phone_number) {
		this.phoneNumber = phone_number;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return String.format("%d, %s, %s, %s, %s, %d", id, doctorName, dateOfBirth, city, phoneNumber, fees);
	}
}
