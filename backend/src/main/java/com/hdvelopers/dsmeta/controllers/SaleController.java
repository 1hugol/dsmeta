package com.hdvelopers.dsmeta.controllers;

import com.hdvelopers.dsmeta.entities.Sale;
import com.hdvelopers.dsmeta.services.SaleService;
import com.hdvelopers.dsmeta.services.SmsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    private SaleService service;
    private SmsService smsService;

    public SaleController(SaleService service, SmsService smsService) {
        this.service = service;
        this.smsService = smsService;
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public Page<Sale> findSales(
            @RequestParam(value = "minDate", defaultValue = "") String minDate,
            @RequestParam(value = "maxDate", defaultValue = "") String maxDate,
            Pageable pageable) {
        return service.findSales(minDate, maxDate, pageable);
    }

    @GetMapping("/notification/{id}")
    public void notifySms(@PathVariable Long id) {
        smsService.sendSms(id);
    }

}
