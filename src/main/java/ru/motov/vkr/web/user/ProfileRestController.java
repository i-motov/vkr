package ru.motov.vkr.web.user;

import org.springframework.stereotype.Controller;
import ru.motov.vkr.model.User;

import static ru.motov.vkr.web.SecurityUtil.authUserId;

@Controller
public class ProfileRestController extends AbstractUserController {

    public User get() {
        return super.get(authUserId());
    }

    public void delete() {
        super.delete(authUserId());
    }

    public void update(User user) {
        super.update(user, authUserId());
    }
}
