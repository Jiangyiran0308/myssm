package com.jyr.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

    @Test
    public void test() throws Exception {
        String str = testDao.configTest();
        System.out.println(str);
    }
}
