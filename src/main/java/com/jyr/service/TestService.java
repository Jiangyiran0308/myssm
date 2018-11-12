package com.jyr.service;

import com.jyr.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Jiang
 * @Date: Created in 15:40  2018\11\12 0012
 * @Description:
 * @Modified By:
 */
public class TestService {
    @Autowired
    TestDao testDao ;
    public void testService(){
        String aa = testDao.configTest();
        System.out.println(aa);
    }
}
