package ru.motov.vkr.service.datajpa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;
import ru.motov.vkr.UserTestData;
import ru.motov.vkr.model.Meal;
import ru.motov.vkr.service.AbstractMealServiceTest;
import ru.motov.vkr.util.exception.NotFoundException;

import static ru.motov.vkr.MealTestData.*;
import static ru.motov.vkr.Profiles.DATAJPA;
import static ru.motov.vkr.UserTestData.ADMIN_ID;
import static ru.motov.vkr.UserTestData.admin;

@ActiveProfiles(DATAJPA)
class DataJpaMealServiceTest extends AbstractMealServiceTest {
    @Test
    void getWithUser() {
        Meal adminMeal = service.getWithUser(ADMIN_MEAL_ID, ADMIN_ID);
        MEAL_MATCHER.assertMatch(adminMeal, adminMeal1);
        UserTestData.USER_MATCHER.assertMatch(adminMeal.getUser(), admin);
    }

    @Test
    void getWithUserNotFound() {
        Assertions.assertThrows(NotFoundException.class,
                () -> service.getWithUser(1, ADMIN_ID));
    }
}
