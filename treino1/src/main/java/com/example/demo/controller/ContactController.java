package com.example.demo.controller;

import com.example.demo.entity.Contact;
import com.example.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
    @Autowired

    private ContactService contactService;

    @PostMapping("/addContact")
    public Contact addContact(@RequestBody Contact contact){
        return contactService.saveContact(contact);
    }
    @PostMapping("/addContacts")
    public List<Contact> addContacts(@RequestBody List<Contact> contacts){
        return contactService.saveContacts(contacts);
    }

    @GetMapping("/getcontacts")
    public List<Contact> getContacts(@RequestBody List<Contact> contacts){
        return contactService.getContacts(contacts);
    }

    @GetMapping("/getcontactById/{id}")
    public Contact getById(@PathVariable int id){
        return contactService.getContactById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id){
        return contactService.removeContact(id);
    }

    @PutMapping("/update")
    public Contact updateContact(@RequestBody Contact contact){
        return contactService.updateContact(contact);
    }


}
