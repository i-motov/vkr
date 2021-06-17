package ru.motov.vkr.service.jpa;

import org.springframework.test.context.ActiveProfiles;
import ru.motov.vkr.service.AbstractMealServiceTest;

import static ru.motov.vkr.Profiles.JPA;

@ActiveProfiles(JPA)
public class JpaMealServiceTest extends AbstractMealServiceTest {
}
