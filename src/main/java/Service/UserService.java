package Service;

import domain.LoginUser;

public interface UserService {
    boolean register(LoginUser user);

    boolean active(String code);
    LoginUser Login(LoginUser user);
}
