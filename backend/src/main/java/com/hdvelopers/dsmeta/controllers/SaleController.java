package com.hdvelopers.dsmeta.controllers;

import com.hdvelopers.dsmeta.entities.Sale;
import com.hdvelopers.dsmeta.services.SaleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    public Page<Sale> findAll(
            @RequestParam(value = "minDate", defaultValue = "") String minDate,
            @RequestParam(value = "minDate", defaultValue = "") String maxDate,
            Pageable pageable) {
        return service.findSales(minDate, maxDate, pageable);
    }

}
