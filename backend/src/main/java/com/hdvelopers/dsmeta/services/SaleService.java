package com.hdvelopers.dsmeta.services;

import com.hdvelopers.dsmeta.entities.Sale;
import com.hdvelopers.dsmeta.repositories.SaleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    private SaleRepository repository;

    public SaleService(SaleRepository repository) {
        this.repository = repository;
    }

    public List<Sale> findAll() {
        return repository.findAll();
    }

}
