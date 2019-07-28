package com.cloud.hq.business;

import com.cloud.hq.business.model.User;
import com.cloud.hq.business.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CloudAdminServerApplicationTests {

    @Autowired
    private IUserService iUserService;
    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("huang");
        user.setPassword("pwd");
        user.setPhone("123");
        user.setCreateTime(LocalDateTime.now());
        user.setDelFlag(0);
        iUserService.save(user);
    }

}
