package ru.motov.vkr.service.datajpa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;
import ru.motov.vkr.MealTestData;
import ru.motov.vkr.UserTestData;
import ru.motov.vkr.model.User;
import ru.motov.vkr.service.AbstractUserServiceTest;
import ru.motov.vkr.util.exception.NotFoundException;

import static ru.motov.vkr.Profiles.DATAJPA;
import static ru.motov.vkr.UserTestData.ADMIN_ID;
import static ru.motov.vkr.UserTestData.USER_MATCHER;

@ActiveProfiles(DATAJPA)
class DataJpaUserServiceTest extends AbstractUserServiceTest {
    @Test
    void getWithMeals() {
        User admin = service.getWithMeals(ADMIN_ID);
        USER_MATCHER.assertMatch(admin, UserTestData.admin);
        MealTestData.MEAL_MATCHER.assertMatch(admin.getMeals(), MealTestData.adminMeal2, MealTestData.adminMeal1);
    }

    @Test
    void getWithMealsNotFound() {
        Assertions.assertThrows(NotFoundException.class,
                () -> service.getWithMeals(1));
    }
}