package io.code.restaurant.service.impl;

import io.code.restaurant.entity.Menu;
import io.code.restaurant.model.response.MenuResponse;
import io.code.restaurant.repository.MenuRepository;
import io.code.restaurant.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
  @Autowired
  MenuRepository menuRepository;
  @Override
  public List<Menu> getAllMenu() throws Exception {
    return menuRepository.findAll();
  }

  @Override
  public List<MenuResponse> getListMenuByTime(int timeTableId) throws Exception {
    List<Menu> menuList = menuRepository.getListMennu(timeTableId);
    List <MenuResponse> list = new ArrayList<>();
    for (Menu m: menuList) {
      MenuResponse menu = new MenuResponse();
      menu.setName(m.getName());
      menu.setPrice(m.getPrice());
      menu.setStatus(m.isStatus());
      menu.setDescription(m.getDescription());
      menu.setSold_quantity(m.getSold_quantity());
      menu.setBest_seller(m.isBest_seller());
      list.add(menu);
    }
    return list;
  }
}
