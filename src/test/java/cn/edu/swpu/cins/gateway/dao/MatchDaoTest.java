package cn.edu.swpu.cins.gateway.dao;

import cn.edu.swpu.cins.gateway.entity.persistence.TeamInfo;
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
public class MatchDaoTest {

	@Resource
	private MatchDao matchDao;

	@Test
	@Transactional
	public void saveTeam() throws Exception {
		TeamInfo teamInfo = new TeamInfo();
		teamInfo.setTeamName("test");
		int result = matchDao.saveTeam(teamInfo);
		Assert.assertNotNull(result);
	}

	@Test
	public void selectAll() throws Exception {
		System.out.println(matchDao.selectAll().toString());
	}


}
