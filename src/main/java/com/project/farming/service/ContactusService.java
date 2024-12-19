package com.project.farming.service;

import java.util.List;

import com.project.farming.model.Contactus;

public interface ContactusService {
	Contactus insertrecord(Contactus r);
	List<Contactus> getAll();
	void del(int ri);
	Contactus updaterecord(int i, Contactus r);
	Contactus updaterecord(Contactus r);

}
