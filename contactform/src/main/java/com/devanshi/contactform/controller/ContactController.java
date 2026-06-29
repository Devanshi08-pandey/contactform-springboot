package com.devanshi.contactform.controller;

import com.devanshi.contactform.entity.Contact;
import com.devanshi.contactform.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ContactController {

    @Autowired
    private ContactRepository repository;

    @PostMapping("/submit")
    public Contact saveContact(@RequestBody Contact contact) {
        return repository.save(contact);
    }

    @GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return repository.findAll();
    }
}