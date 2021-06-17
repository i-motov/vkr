package ru.motov.vkr.service.jdbc;

import org.springframework.test.context.ActiveProfiles;
import ru.motov.vkr.service.AbstractMealServiceTest;

import static ru.motov.vkr.Profiles.JDBC;

@ActiveProfiles(JDBC)
public class JdbcMealServiceTest extends AbstractMealServiceTest {
}
