package com.project.farming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.farming.model.Contactus;
import com.project.farming.repository.ContactusRepository;

import com.project.farming.service.ContactusService;
@Service

public class ContactusServiceImpl implements ContactusService{

	@Autowired
	@Qualifier("conRepo")
    private ContactusRepository conRepo;

	@Override     
	public Contactus insertrecord(Contactus r) {
		// TODO Auto-generated method stub
		return conRepo.save(r);
	}

	@Override
	public List<Contactus> getAll() {
		// TODO Auto-generated method stub
		return Contactus.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		conRepo.deleteById(ri);
		
	}

	@Override
	public Contactus updaterecord(int i,Contactus r) {
		Optional<Contactus> opt=conRepo.findById(i);
		if(opt.isPresent())
		{
			Contactus rold=opt.get();
			rold.setEmailid(r.getEmailid());
			rold.setAddress(r.getAddress());
			rold.setPhoneno(r.getphoneno());
			
			
			return conRepo.save(rold);
		}
		
		return null;
	}

	@Override
	public Contactus updaterecord(Contactus r) {
		// TODO Auto-generated method stub
		return null;
	}


       
	
}