package io.code.restaurant.service;

import io.code.restaurant.entity.Staff;

import java.util.List;

public interface StaffService {
  List <Staff> getAllStaff() throws Exception;
}
