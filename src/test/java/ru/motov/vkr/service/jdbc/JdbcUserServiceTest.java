package ru.motov.vkr.service.jdbc;

import org.springframework.test.context.ActiveProfiles;
import ru.motov.vkr.service.AbstractUserServiceTest;

import static ru.motov.vkr.Profiles.JDBC;

@ActiveProfiles(JDBC)
public class JdbcUserServiceTest extends AbstractUserServiceTest {
}
