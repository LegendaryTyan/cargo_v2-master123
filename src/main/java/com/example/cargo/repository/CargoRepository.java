package com.example.cargo.repository;

import java.util.List;


import com.example.cargo.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CargoRepository extends JpaRepository<Cargo, Long> {
    @Query("SELECT p FROM Cargo p WHERE CONCAT(p.cargoName, '', p.cargoContents, '',p.cityOfDispatch, '', p.shipmentDate, '',p.arrivalCity,'',p.arrivalDate) LIKE %?1%")
    List<Cargo> search(String keyword);
}
