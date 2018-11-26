package com.jyr.dao;

import com.jyr.model.Account;
import com.jyr.model.AccountUser;
import com.jyr.util.AccountUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * @Author: Jiang
 * @Date: Created in 14:32  2018\9\19 0019
 * @Description:
 * @Modified By:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class TestDaoTeset {
    @Autowired
    private TestDao testDao;
    @Autowired
    private AccountDao accountDao ;

    @Test
    public void test() throws Exception {
        String str = testDao.configTest();
        System.out.println(str);
    }

    @Test
    public void accountdaotest(){
        List<Account> list = accountDao.selectAll();
        System.out.println(list.get(1).getName());
        System.out.println(list.get(1).getPassword());
        System.out.println(list.get(1).getUsername());
    }
    @Test
    public void createAccount(){
        Account account = new Account();
        account.setUsername("superadmin");
        account.setPassword(AccountUtil.getMD5("123456"));
        account.setName("超级管理员");
        account.setCreate_time(new Date());
        accountDao.createAccount(account);
    }
}
