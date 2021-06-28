package io.code.restaurant.service.impl;

import io.code.restaurant.entity.TableReservation;
import io.code.restaurant.model.request.TableOrderRequest;
import io.code.restaurant.repository.TableReservationRepository;
import io.code.restaurant.service.TableReservationService;
import io.code.restaurant.util.ResponseMessageConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableReservationServiceImpl implements TableReservationService {

  @Autowired
  TableReservationRepository  tableReservationRepository;

  @Override
  public TableReservation orderTable(TableOrderRequest request) throws Exception {
    TableReservation tableReservation = new TableReservation();
    if(request.getName() == null || request.getPhone() == null){
      throw new Exception(ResponseMessageConstants.NAME_OR_PHONE_CANNOT_NULL);
    }
    tableReservation.setName(request.getName());
    tableReservation.setEmail(request.getEmail());
    tableReservation.setPhone(request.getPhone());
    tableReservation.setNumberOfGuest(request.getNumberOfGuest());
    tableReservation.setDateTable(request.getDateTable());
    tableReservation.setTimeTable(request.getTimeTable());
    tableReservation.setMessage(request.getMessage());
    if (tableReservation == null){
      throw new Exception(ResponseMessageConstants.ORDER_TABLE_FAILED);
    }
    return tableReservationRepository.save(tableReservation);
  }
}
