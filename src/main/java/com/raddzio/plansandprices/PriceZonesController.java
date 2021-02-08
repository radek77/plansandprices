package com.raddzio.plansandprices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Controller
@RequestMapping(path = "v1")
public class PriceZonesController {

    @Autowired
    private PriceZoneRepository priceZoneRepository;
    @Autowired
    private PriceZoneModelAssembler priceZoneModelAssembler;

    @GetMapping("/price-zones")
    public @ResponseBody
    CollectionModel<EntityModel<PriceZone>> getAllPriceZones() {
        List<EntityModel<PriceZone>> priceZones = priceZoneRepository.findAll().stream()
                .map(priceZoneModelAssembler::toModel)
                .collect(Collectors.toList());

        return CollectionModel.of(priceZones, linkTo(methodOn(PriceZonesController.class).getAllPriceZones()).withSelfRel());
    }

    @GetMapping("/price-zones/{id}")
    public @ResponseBody
    EntityModel<PriceZone> getPriceZoneById(@PathVariable String id) throws PriceZoneNotFoundException {
        PriceZone priceZone = priceZoneRepository.findById(id).orElseThrow(() -> new PriceZoneNotFoundException(id));

        return priceZoneModelAssembler.toModel(priceZone);
    }
}
