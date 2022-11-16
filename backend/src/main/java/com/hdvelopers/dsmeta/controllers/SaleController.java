package com.hdvelopers.dsmeta.controllers;

import com.hdvelopers.dsmeta.entities.Sale;
import com.hdvelopers.dsmeta.services.SaleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    private SaleService service;

    public SaleController(SaleService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<Sale> findAll() {
        return service.findAll();
    }

}
