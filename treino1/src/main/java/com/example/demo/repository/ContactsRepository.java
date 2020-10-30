package com.example.demo.repository;

import com.example.demo.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contact, Integer> {
}
