package Dao;


import domain.LoginUser;

public interface UserDao {
    LoginUser findByUsername(LoginUser user);
    void saveLogin(LoginUser user);
    void updateUserStats(LoginUser User);
    LoginUser findByCode(String code);

    public LoginUser getUserByUserNameAndPassword(String Username,String password);
}
