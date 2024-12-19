package com.project.farming.service;
import java.util.List;

import com.project.farming.model.BuyNow;

public interface BuyNowService {
	BuyNow insertrecord(BuyNow r);
	List<BuyNow> getAll();
	void del(int ri);
	BuyNow updaterecord(int i, BuyNow r);
	BuyNow updaterecord(BuyNow r);

}


