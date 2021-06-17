package ru.motov.vkr.service.jpa;

import org.springframework.test.context.ActiveProfiles;
import ru.motov.vkr.service.AbstractUserServiceTest;

import static ru.motov.vkr.Profiles.JPA;

@ActiveProfiles(JPA)
public class JpaUserServiceTest extends AbstractUserServiceTest {
}
