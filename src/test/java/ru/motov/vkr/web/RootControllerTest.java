package ru.motov.vkr.web;

import org.junit.jupiter.api.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static ru.motov.vkr.TestUtil.userAuth;
import static ru.motov.vkr.UserTestData.admin;
import static ru.motov.vkr.UserTestData.user;

class RootControllerTest extends AbstractControllerTest {

    @Test
    void getUsers() throws Exception {
        perform(get("/users")
                .with(userAuth(admin)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("users"))
                .andExpect(forwardedUrl("/WEB-INF/jsp/users.jsp"));
    }

    @Test
    void unAuth() throws Exception {
        perform(get("/users"))
                .andDo(print())
                .andExpect(status().is3xxRedirection())
                .andExpect(redirectedUrl("http://localhost/login"));
    }

    @Test
    void getMeals() throws Exception {
        perform(get("/meals")
                .with(userAuth(user)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("meals"))
                .andExpect(forwardedUrl("/WEB-INF/jsp/meals.jsp"));
    }
}