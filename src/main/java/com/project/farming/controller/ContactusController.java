package com.project.farming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.farming.model.Contactus;
import com.project.farming.service.ContactusService;
@RestController
public class ContactusController {
	@Autowired
	private ContactusService cs;
	@GetMapping("/Contactus")
	public List<Contactus> handleget()
	{
		return cs.getAll();
	}

	@PostMapping("/addcon")
	public Contactus add(@RequestBody Contactus r)

	{
	 return cs.insertrecord(r);	
	}

	@DeleteMapping("/delcon/{rid}")
	public void delr(@PathVariable("rid")int r)
	{
		cs.del(r);
	}

	@PutMapping("/upcon/{rid}")
	public Contactus update(@PathVariable("rid")int i,@RequestBody Contactus r)
	{
		return cs.updaterecord(i,r);
	}
	
}
