package com.project.farming.model;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Contactus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Contactid;

	private String emailid,address,phoneno;
	public Contactus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contactus(String emailid, String address,  String phoneno ) {
		super();
		this.emailid = emailid;
		this.address = address;
		this.phoneno = phoneno;
		
	
	}
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getphoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	
	
	
	@Override
	public String toString() {
		return " Contactus[ emailid=" + emailid + ",  address=" + address + ",	phoneno=" + phoneno +   "]";
	}
	public static List<Contactus> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getname() {
		// TODO Auto-generated method stub
		return null;
	}
}
	