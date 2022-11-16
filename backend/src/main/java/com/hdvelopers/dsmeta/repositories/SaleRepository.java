package com.hdvelopers.dsmeta.repositories;

import com.hdvelopers.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository <Sale, Long>{
}
