package ru.motov.vkr.web.json;

import org.junit.jupiter.api.Test;
import ru.motov.vkr.MealTestData;
import ru.motov.vkr.model.Meal;

import java.util.List;

import static ru.motov.vkr.MealTestData.*;

class JsonUtilTest {

    @Test
    void readWriteValue() {
        String json = JsonUtil.writeValue(adminMeal1);
        System.out.println(json);
        Meal meal = JsonUtil.readValue(json, Meal.class);
        MEAL_MATCHER.assertMatch(meal, adminMeal1);
    }

    @Test
    void readWriteValues() {
        String json = JsonUtil.writeValue(meals);
        System.out.println(json);
        List<Meal> meals = JsonUtil.readValues(json, Meal.class);
        MEAL_MATCHER.assertMatch(meals, MealTestData.meals);
    }
}
