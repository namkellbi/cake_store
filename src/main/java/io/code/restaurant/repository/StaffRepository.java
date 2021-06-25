package io.code.restaurant.repository;

import io.code.restaurant.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StaffRepository extends JpaRepository <Staff, Integer> {

  @Query(value = "select f from Staff f")
  List<Staff> findAllStaff();
}
