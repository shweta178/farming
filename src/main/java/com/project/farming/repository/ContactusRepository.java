package com.project.farming.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.farming.model.Contactus;
@Repository
@Qualifier("conRepo")
public interface ContactusRepository extends JpaRepository<Contactus,Integer>{

}
