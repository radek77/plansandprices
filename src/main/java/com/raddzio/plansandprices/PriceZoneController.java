package com.raddzio.plansandprices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "v1")
public class PriceZoneController {

    @Autowired
    private PriceZoneRepository priceZoneRepository;

    @GetMapping("/price-zones")
    public @ResponseBody
    Iterable<PriceZone> getAllPriceZones() {
        return priceZoneRepository.findAll();
    }

    @GetMapping("/price-zones/{id}")
    public @ResponseBody
    PriceZone getPriceZoneById(@PathVariable String id) {
        return priceZoneRepository.getPriceZoneById(id);
    }
}
