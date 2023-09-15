package com.SportEat.sporteat.repository;

import com.SportEat.sporteat.models.Dinner;
import org.springframework.data.repository.CrudRepository;

public interface dinnerRepository extends CrudRepository<Dinner, Long> {
}
