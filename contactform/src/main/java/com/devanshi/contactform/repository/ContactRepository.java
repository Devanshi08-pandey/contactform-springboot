package com.devanshi.contactform.repository;

import com.devanshi.contactform.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}