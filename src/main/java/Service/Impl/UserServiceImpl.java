package Service.Impl;

import Dao.Impl.UserDaoImpl;
import Dao.UserDao;
import Service.UserService;
import Util.MailUtils;
import Util.Md5Util;
import Util.UuidUtil;
import domain.LoginUser;
import org.junit.jupiter.api.Test;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();


    @Override
    public boolean register(LoginUser user) {
        LoginUser user1 =userDao.findByUsername(user);
        if(user1!=null)
        {
            return false;
        }
        user.setCode(UuidUtil.getUuid());
        user.setUser_stats(1);
        userDao.saveLogin(user);
        String content = "<a href='http://localhost:8080/srt/User/active?code="+user.getCode()+"'>点击激活账号</a>";
        System.out.println(content);
        MailUtils.sendMail(user.getCustomer_email(),content,"激活");
        return true;

    }

    @Override
    public boolean active(String code) {
       LoginUser user = userDao.findByCode(code);
       if(user!=null)
        {
            userDao.updateUserStats(user);
            return true;
        }
        return false;
    }

    @Override
    public LoginUser Login(LoginUser user) {
        return userDao.getUserByUserNameAndPassword(user.getUsername(),user.getPassword());
    }

    @Test
    void Test() throws Exception {
       LoginUser user = new LoginUser("admin","123321",0,"2570504756@qq.com","2020-10-17");
       user.setPassword(Md5Util.encodeByMd5(user.getPassword()));
       boolean register = register(user);
       System.out.println(register);
    }
}
