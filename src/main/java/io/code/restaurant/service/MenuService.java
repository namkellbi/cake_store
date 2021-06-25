package io.code.restaurant.service;

import io.code.restaurant.entity.Menu;

import java.util.List;

public interface MenuService {
  List<Menu> getAllMenu() throws Exception;
}
