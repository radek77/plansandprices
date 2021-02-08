package com.raddzio.plansandprices;

public class PlanNotFoundException extends RuntimeException {
    public PlanNotFoundException(Long id) {
        super("Plan not found: " + id);
    }
}
