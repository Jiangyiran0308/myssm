package com.jyr.service.Implements;

import com.jyr.dao.AccountDao;
import com.jyr.model.Account;
import com.jyr.model.Message.SimpleMessage;
import com.jyr.service.AccountService;
import com.jyr.util.AccountUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountDao accountDao ;


    @Override
    public SimpleMessage createAccount(Account account) {
        String name = account.getUsername() ;
        if(accountDao.selectAccountByName(name) != null){
            System.out.println(account.getPassword());
            String password = AccountUtil.getMD5(account.getPassword()) ;
            if(password.isEmpty()){
                return SimpleMessage.error("账号加密失败，密码不规范") ;
            }
            account.setPassword(password);
            accountDao.createAccount(account);
            return SimpleMessage.success("创建账号成功");
        }
        else{
            return SimpleMessage.warn("该用户名已被占用，请更换用户名") ;
        }
    }
}
