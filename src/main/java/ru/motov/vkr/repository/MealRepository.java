package ru.motov.vkr.repository;

import ru.motov.vkr.model.Meal;

import java.util.Collection;

public interface MealRepository {
    // null if updated meal does not belong to userId
    Meal save(Meal meal);

    // false if meal does not belong to userId
    boolean delete(int id);

    // null if meal does not belong to userId
    Meal get(int id);

    // ORDERED dateTime desc
    Collection<Meal> getAll();
}
