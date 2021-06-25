package io.code.restaurant.repository;

import io.code.restaurant.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
