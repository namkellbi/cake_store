package io.code.restaurant.service.impl;

import io.code.restaurant.entity.Staff;
import io.code.restaurant.repository.StaffRepository;
import io.code.restaurant.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffServiceImpl implements StaffService {
  @Autowired
  StaffRepository staffRepository;

  @Override
  public List<Staff> getAllStaff() throws Exception {
    return staffRepository.findAllStaff();
  }
}
