package io.code.restaurant.service.impl;

import io.code.restaurant.entity.Contact;
import io.code.restaurant.repository.ContactRepository;
import io.code.restaurant.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
  @Autowired
  ContactRepository contactRepository;

  @Override
  public List<Contact> getAllContact() {
    return contactRepository.findAll();
  }
}
