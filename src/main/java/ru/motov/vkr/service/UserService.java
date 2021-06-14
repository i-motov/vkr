package ru.motov.vkr.service;

import ru.motov.vkr.model.User;
import ru.motov.vkr.repository.UserRepository;

import java.util.List;

import static ru.motov.vkr.util.ValidationUtil.checkNotFound;
import static ru.motov.vkr.util.ValidationUtil.checkNotFoundWithId;

public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User create(User user) {
        return repository.save(user);
    }

    public void delete(int id) {
        checkNotFoundWithId(repository.delete(id), id);
    }

    public User get(int id) {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public User getByEmail(String email) {
        return checkNotFound(repository.getByEmail(email), "email=" + email);
    }

    public List<User> getAll() {
        return repository.getAll();
    }

    public void update(User user) {
        checkNotFoundWithId(repository.save(user), user.getId());
    }
}