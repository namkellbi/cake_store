package io.code.restaurant.repository;

import io.code.restaurant.entity.TableReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableReservationRepository extends JpaRepository<TableReservation, Integer> {
}
