package com.example.inquiry.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.inquiry.entity.Inquiry;
import com.example.inquiry.repository.InquiryRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InquiryService {

	@Autowired
	InquiryRepository inquiryRepository;

	/**
	 * Insert Inquiry
	 * @param inquiry
	 */
	public void save(Inquiry inquiry) { inquiryRepository.save(inquiry); }

	/**
	 * SELECT Inquiry
	 * @return Inquiry list
	 */
	public List<Inquiry> findAll() { return inquiryRepository.findAll(); }
}
