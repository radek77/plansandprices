package com.raddzio.plansandprices;

public class PriceZoneNotFoundException extends RuntimeException {
    public PriceZoneNotFoundException(String id) {
        super("Price Zone not found: " + id);
    }
}
