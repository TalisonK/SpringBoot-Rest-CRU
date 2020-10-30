package com.example.demo.service;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    @Autowired
    private ContactsRepository repository;

    public Contact saveContact(Contact contact){
        return repository.save(contact);
    }

    public List<Contact> saveContacts(List<Contact> contacts){
        return repository.saveAll(contacts);
    }

    public List<Contact> getContacts(List<Contact> contacts){
        return repository.findAll();
    }

    public Contact getContactById(int id){
        return repository.findById(id).orElse(null);
    }

    public String removeContact(int id){
        repository.deleteById(id);
        return "removido: " + id;
    }

    public Contact updateContact(Contact contact){
        Contact oldContact = repository.findById(contact.getId()).orElse(null);
        oldContact.setName(contact.getName());
        oldContact.setContact(contact.getContact());
        return repository.save(oldContact);
    }

}
