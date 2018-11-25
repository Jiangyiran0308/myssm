package com.jyr.dao;

import com.jyr.model.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountDao {
    List<Account> selectAll();
    Account selectAccountByName(@Param("username")String username);
    Account selectAccountById(@Param("id")String id);
    void createAccount(Account account);
}
