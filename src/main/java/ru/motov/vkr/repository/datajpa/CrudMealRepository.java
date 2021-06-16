package ru.motov.vkr.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.motov.vkr.model.Meal;

public interface CrudMealRepository extends JpaRepository<Meal, Integer> {
}
