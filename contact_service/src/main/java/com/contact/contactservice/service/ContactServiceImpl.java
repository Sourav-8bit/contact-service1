package com.contact.contactservice.service;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contactservice.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L, "amit@gmail.com", "Amit", 1311L),
            new Contact(2L, "anil@gmail.com", "Anil", 1311L),
            new Contact(3L, "rohan@gmail.com", "Rohan", 1312L),
            new Contact(4L, "sameer@gmail.com", "Sameer", 1314L)
    );

	@Override
	public List<Contact> getContactsOfUser2(Long userId) {
		
		return list.stream().filter(Contact ->Contact.getUserId().equals(userId)).collect(Collectors.toList());
				
	}



}

	
	
	

	
	


	
	


	

	
	
	


