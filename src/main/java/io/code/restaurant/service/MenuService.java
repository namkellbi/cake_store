package io.code.restaurant.service;

import io.code.restaurant.entity.Menu;
import io.code.restaurant.model.response.MenuResponse;

import java.util.List;

public interface MenuService {

  List<Menu> getAllMenu() throws Exception;

  List <MenuResponse> getListMenuByTime(int timeTableId) throws Exception;
}
