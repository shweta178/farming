package com.project.farming.service;

import java.util.List;

import com.project.farming.model.Feedback;

public interface FeedbackService {
	Feedback insertrecord(Feedback r);
	List<Feedback> getAll();
	void del(int ri);
	Feedback updaterecord(Feedback r);
	Feedback updaterecord(int i, Feedback r);

}
