package com.raddzio.plansandprices;

import org.springframework.data.repository.CrudRepository;

public interface PlanRepository extends CrudRepository<Plan, Long> {

    public Plan getPlanById(Long id);
}
