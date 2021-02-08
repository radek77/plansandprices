package com.raddzio.plansandprices;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class PriceZoneModelAssembler implements RepresentationModelAssembler<PriceZone, EntityModel<PriceZone>> {

    @Override
    public EntityModel<PriceZone> toModel(PriceZone priceZone) {

        return EntityModel.of(priceZone,
                linkTo(methodOn(PriceZonesController.class).getPriceZoneById(priceZone.getId())).withSelfRel(),
                linkTo(methodOn(PriceZonesController.class).getAllPriceZones()).withRel("price-zones")
        );
    }
}