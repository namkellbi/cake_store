package io.code.restaurant.repository;

import io.code.restaurant.entity.Menu;
import io.code.restaurant.model.response.MenuResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

  @Query(value = "select * from menu where time_table_id = ?1", nativeQuery = true)
  List<Menu> getListMennu(int timeTableId);
}
