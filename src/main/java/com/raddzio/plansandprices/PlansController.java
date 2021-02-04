package com.raddzio.plansandprices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "v1")
public class PlansController {
    
    @Autowired
    private PlanRepository planRepository;

    @GetMapping("/plans")
    public @ResponseBody
    Iterable<Plan> getAllPlans() {
        return planRepository.findAll();
    }

    @GetMapping("/plans/{id}")
    public @ResponseBody
    Plan getPlanById(@PathVariable Long id) {
        return planRepository.getPlanById(id);
    }
}
