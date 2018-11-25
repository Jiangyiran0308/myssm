package com.jyr.model;

import java.io.Serializable;
import java.util.List;

public class UserGroup implements Serializable {
    private String id ;
    private String group_name ;

    private List<Account> accountList ;
    private List<Role> roleList ;

}
