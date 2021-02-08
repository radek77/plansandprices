package com.raddzio.plansandprices;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class PlanModelAssembler implements RepresentationModelAssembler<Plan, EntityModel<Plan>> {

    @Override
    public EntityModel<Plan> toModel(Plan plan) {

        return EntityModel.of(plan,
                linkTo(methodOn(PlansController.class).getPlanById(plan.getId())).withSelfRel(),
                linkTo(methodOn(PlansController.class).getAllPlans()).withRel("price-zones")
        );
    }
}