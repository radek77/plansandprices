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
public class PlansController {

    @Autowired
    private PlanRepository planRepository;
    @Autowired
    private PlanModelAssembler planModelAssembler;

    @GetMapping("/plans")
    public @ResponseBody
    CollectionModel<EntityModel<Plan>> getAllPlans() {
        List<EntityModel<Plan>> plans = planRepository.findAll().stream()
                .map(planModelAssembler::toModel)
                .collect(Collectors.toList());

        return CollectionModel.of(plans, linkTo(methodOn(PlansController.class).getAllPlans()).withSelfRel());
    }

    @GetMapping("/plans/{id}")
    public @ResponseBody
    EntityModel<Plan> getPlanById(@PathVariable Long id) throws PlanNotFoundException {
        Plan plan = planRepository.findById(id).orElseThrow(() -> new PlanNotFoundException(id));

        return planModelAssembler.toModel(plan);
    }
}
