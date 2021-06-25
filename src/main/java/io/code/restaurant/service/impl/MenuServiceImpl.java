package io.code.restaurant.service.impl;

import io.code.restaurant.entity.Menu;
import io.code.restaurant.repository.MenuRepository;
import io.code.restaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
  @Autowired
  MenuRepository menuRepository;
  @Override
  public List<Menu> getAllMenu() throws Exception {
    return menuRepository.findAll();
  }
}
