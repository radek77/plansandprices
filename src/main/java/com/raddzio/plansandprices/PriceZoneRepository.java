package com.raddzio.plansandprices;

import org.springframework.data.repository.CrudRepository;

public interface PriceZoneRepository extends CrudRepository<PriceZone, String> {

    public PriceZone getPriceZoneById(String id);
}
