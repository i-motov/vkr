package ru.motov.vkr.web.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import ru.motov.vkr.repository.inmemory.InMemoryUserRepository;
import ru.motov.vkr.util.exception.NotFoundException;

import static ru.motov.vkr.UserTestData.NOT_FOUND;
import static ru.motov.vkr.UserTestData.USER_ID;

@SpringJUnitConfig(locations = {"classpath:spring/inmemory.xml"})
class InMemoryAdminRestControllerSpringTest {

    @Autowired
    private AdminRestController controller;

    @Autowired
    private InMemoryUserRepository repository;

    @BeforeEach
    void setup() {
        repository.init();
    }

    @Test
    void delete() {
        controller.delete(USER_ID);
        Assertions.assertNull(repository.get(USER_ID));
    }

    @Test
    void deleteNotFound() {
        Assertions.assertThrows(NotFoundException.class, () -> controller.delete(NOT_FOUND));
    }
}