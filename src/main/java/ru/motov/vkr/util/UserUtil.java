package ru.motov.vkr.util;

import ru.motov.vkr.model.Role;
import ru.motov.vkr.model.User;
import ru.motov.vkr.to.UserTo;

public class UserUtil {

    public static final int DEFAULT_CALORIES_PER_DAY = 2000;

    public static User createNewFromTo(UserTo userTo) {
        return new User(null, userTo.getName(), userTo.getEmail().toLowerCase(), userTo.getPassword(), Role.USER);
    }
}
