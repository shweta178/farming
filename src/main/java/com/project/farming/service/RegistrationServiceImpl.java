package com.project.farming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.project.farming.model.Registration;
import com.project.farming.repository.RegistrationRepository;
import com.project.farming.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	
	@Autowired
	@Qualifier("regRepo")
    private RegistrationRepository regRepo;

	@Override
	public Registration insertrecord(Registration r) {
		// TODO Auto-generated method stub
		return regRepo.save(r);
	}

	@Override
	public List<Registration> getAll() {
		// TODO Auto-generated method stub
		return regRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		regRepo.deleteById(ri);
	}

	@Override
	public Registration updaterecord(int i, Registration r) {
		// TODO Auto-generated method stub
		Optional<Registration> opt=regRepo.findById(i);
		if(opt.isPresent()) {
			Registration rold=opt.get();
			rold.setName(r.getName());
			rold.setAddress(r.getAddress());
			rold.setGender(r.getGender());
			rold.setContact(r.getContact());
			rold.setCity(r.getCity());
			rold.setEmailid(r.getEmailid());
			rold.setPassword(r.getPassword());
			return regRepo.save(rold);
		}
		return null;
	}

	@Override
	public List<Registration> login(String emailid, String password) {
		// TODO Auto-generated method stub
		return regRepo.findAllByEmailidAndPassword(emailid, password);
	}




	
	


	
}