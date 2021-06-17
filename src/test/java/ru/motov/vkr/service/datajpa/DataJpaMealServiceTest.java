package ru.motov.vkr.service.datajpa;

import org.springframework.test.context.ActiveProfiles;
import ru.motov.vkr.service.AbstractMealServiceTest;

import static ru.motov.vkr.Profiles.DATAJPA;

@ActiveProfiles(DATAJPA)
public class DataJpaMealServiceTest extends AbstractMealServiceTest {
}
