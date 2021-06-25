package io.code.restaurant.controller;

import io.code.restaurant.entity.Staff;
import io.code.restaurant.model.Enums;
import io.code.restaurant.model.ResponseData;
import io.code.restaurant.service.StaffService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HomeController {
  @Autowired
  StaffService staffService;

  private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
  @GetMapping("/list-staff")
  public ResponseData getAllStaff() {
    try {
      List<Staff> list = staffService.getAllStaff();
      return new ResponseData(Enums.ResponseStatus.SUCCESS, list);
    } catch (Exception e) {
      e.printStackTrace();
      return new ResponseData(Enums.ResponseStatus.ERROR, e.getMessage());
    }
  }
}
