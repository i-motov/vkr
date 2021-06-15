package ru.motov.vkr.repository.inmemory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ru.motov.vkr.model.User;
import ru.motov.vkr.repository.UserRepository;

import java.util.Collections;
import java.util.List;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private static final Logger log = LoggerFactory.getLogger(InMemoryUserRepository.class);

    @Override
    public boolean delete(int id) {
        log.info("delete {}", id);
        return true;
    }

    @Override
    public User save(User user) {
        log.info("save {}", user);
        return user;
    }

    @Override
    public User get(int id) {
        log.info("get {}", id);
        return null;
    }

    @Override
    public List<User> getAll() {
        log.info("getAll");
        return Collections.emptyList();
    }

    @Override
    public User getByEmail(String email) {
        log.info("getByEmail {}", email);
        return null;
    }
}