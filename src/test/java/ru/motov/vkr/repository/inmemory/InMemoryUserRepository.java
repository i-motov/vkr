package ru.motov.vkr.repository.inmemory;

import org.springframework.stereotype.Repository;
import ru.motov.vkr.UserTestData;
import ru.motov.vkr.model.User;
import ru.motov.vkr.repository.UserRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static ru.motov.vkr.UserTestData.admin;
import static ru.motov.vkr.UserTestData.user;


@Repository
public class InMemoryUserRepository extends InMemoryBaseRepository<User> implements UserRepository {

    public void init() {
        map.clear();
        map.put(UserTestData.USER_ID, user);
        map.put(UserTestData.ADMIN_ID, admin);
    }

    @Override
    public List<User> getAll() {
        return getCollection().stream()
                .sorted(Comparator.comparing(User::getName).thenComparing(User::getEmail))
                .collect(Collectors.toList());
    }

    @Override
    public User getByEmail(String email) {
        return getCollection().stream()
                .filter(u -> email.equals(u.getEmail()))
                .findFirst()
                .orElse(null);
    }
}