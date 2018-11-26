package com.jyr.util.security;

import com.jyr.util.AccountUtil;
import org.springframework.security.crypto.password.PasswordEncoder;

public class MPasswordEncoder implements PasswordEncoder{
    @Override
    public String encode(CharSequence charSequence) {
        return null;
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        String password = AccountUtil.getMD5(charSequence.toString());
        return password != null && password.equals(s);

    }
}
