package io.code.restaurant.service;

import io.code.restaurant.entity.TableReservation;
import io.code.restaurant.model.request.TableOrderRequest;

public interface TableReservationService {
  TableReservation orderTable (TableOrderRequest request) throws Exception;
}
