package com.contact.contactservice.entity;

public class Contact {
	
	private Long cid;
	private String email;
	private String contactsName;
   private  Long userId;
public Long getCid() {
	return cid;
}
public void setCid(Long cid) {
	this.cid = cid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Contact(Long cid, String email, String contactsName, Long userId) {
	
	this.cid = cid;
	this.email = email;
	this.contactsName = contactsName;
	this.userId = userId;
}
public String getContactsName() {
	return contactsName;
}
public void setContactsName(String contactsName) {
	this.contactsName = contactsName;
}
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public Contact() {

	
}
}
