package io.code.restaurant.controller;

import io.code.restaurant.entity.Contact;
import io.code.restaurant.entity.Menu;
import io.code.restaurant.entity.Staff;
import io.code.restaurant.entity.TableReservation;
import io.code.restaurant.model.request.TableOrderRequest;
import io.code.restaurant.util.Enums;
import io.code.restaurant.util.ResponseData;
import io.code.restaurant.util.ResponseMessageConstants;
import io.code.restaurant.service.ContactService;
import io.code.restaurant.service.MenuService;
import io.code.restaurant.service.StaffService;
import io.code.restaurant.service.TableReservationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class HomeController {

  @Autowired
  StaffService staffService;

  @Autowired
  MenuService menuService;

  @Autowired
  ContactService contactService;

  @Autowired
  TableReservationService tableReservationService;

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

  @GetMapping("/list-menu")
  public ResponseData getAllMenu() {
    try {
      List<Menu> list = menuService.getAllMenu();
      return new ResponseData(Enums.ResponseStatus.SUCCESS, list);
    } catch (Exception e) {
      e.printStackTrace();
      return new ResponseData(Enums.ResponseStatus.ERROR, e.getMessage());
    }
  }

  @GetMapping("/list-contact")
  public ResponseData getAllContact() {
    try {
      List<Contact> list = contactService.getAllContact();
      return new ResponseData(Enums.ResponseStatus.SUCCESS, list);
    } catch (Exception e) {
      e.printStackTrace();
      return new ResponseData(Enums.ResponseStatus.ERROR, e.getMessage());
    }
  }

  @PostMapping("order-table")
  public ResponseData orderTable(@RequestBody TableOrderRequest request){
    try{
    if (request == null){
      return new ResponseData(Enums.ResponseStatus.ERROR.getStatus(), ResponseMessageConstants.DATA_INVALID);
    }
      tableReservationService.orderTable(request);
      return new ResponseData(Enums.ResponseStatus.SUCCESS.getStatus(),
        ResponseMessageConstants.ORDER_TABLE_SUCCESS);
    } catch (Exception e){
      e.printStackTrace();
      return new ResponseData(Enums.ResponseStatus.ERROR, e.getMessage());
    }
  }
}
