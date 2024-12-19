package com.project.farming.repository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.farming.model.BuyNow;
@Repository
@Qualifier("buyRepo")
public interface BuyNowRepository extends JpaRepository<BuyNow,Integer> {

}
