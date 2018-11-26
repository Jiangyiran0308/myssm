package com.jyr.service;


import com.jyr.model.Account;
import com.jyr.model.Message.SimpleMessage;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    public SimpleMessage createAccount(Account account) ;
}
