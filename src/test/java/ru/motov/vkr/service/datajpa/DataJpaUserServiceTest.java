package ru.motov.vkr.service.datajpa;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;
import ru.motov.vkr.MealTestData;
import ru.motov.vkr.UserTestData;
import ru.motov.vkr.model.User;
import ru.motov.vkr.service.AbstractUserServiceTest;
import ru.motov.vkr.util.exception.NotFoundException;

import static ru.motov.vkr.Profiles.DATAJPA;
import static ru.motov.vkr.UserTestData.USER_ID;
import static ru.motov.vkr.UserTestData.USER_MATCHER;

@ActiveProfiles(DATAJPA)
public class DataJpaUserServiceTest extends AbstractUserServiceTest {
    @Test
    public void getWithMeals() {
        User user = service.getWithMeals(USER_ID);
        USER_MATCHER.assertMatch(user, UserTestData.user);
        MealTestData.MEAL_MATCHER.assertMatch(user.getMeals(), MealTestData.meals);
    }

    @Test
    public void getWithMealsNotFound() {
        Assert.assertThrows(NotFoundException.class,
                () -> service.getWithMeals(1));
    }
}