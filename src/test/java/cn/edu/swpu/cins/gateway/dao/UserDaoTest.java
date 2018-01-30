package cn.edu.swpu.cins.gateway.dao;

import cn.edu.swpu.cins.gateway.entity.persistence.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by lzy on 18-1-25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

	@Resource
	private UserDao userDao;

	@Test
	public void getUser() throws Exception {
		UserInfo userinfo = userDao.getUser("lzy@163.com");
		Assert.assertNotNull(userinfo);
		Assert.assertEquals("Mr.Peach",userinfo.getUsername());
	}

	@Test
	public void updateUser() throws Exception {
		String email = "767130703@qq.com";
		int flag = 123;
		userDao.updateUser(email,flag);
	}

	@Test
	@Transactional
	public void addUser() throws Exception {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserName("Mr.Peach").setPwd("test2").setEmail("test");
		Assert.assertNotNull(userInfo);

	}

}
