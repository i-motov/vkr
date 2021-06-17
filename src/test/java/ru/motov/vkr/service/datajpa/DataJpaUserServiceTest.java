package ru.motov.vkr.service.datajpa;

import org.springframework.test.context.ActiveProfiles;
import ru.motov.vkr.service.AbstractUserServiceTest;

import static ru.motov.vkr.Profiles.DATAJPA;

@ActiveProfiles(DATAJPA)
public class DataJpaUserServiceTest extends AbstractUserServiceTest {
}
