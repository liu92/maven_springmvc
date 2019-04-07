package maven_springmvc;

import com.springmvc.po.UserInfo;
import com.springmvc.service.UserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 测试事务
 * <p>
 * Title:SaveTest
 * </p>
 * 
 * @author liuwanlin
 * @date 2017年8月28日下午3:06:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext_test.xml")
@Transactional
public class SaveTest {

	@Resource
	private UserInfoService infoService;

	@Test
	@Rollback()
	public void saveTest() {
		UserInfo inf = new UserInfo();
		inf.setUname("kjhkh");
		inf.setUnumber(7890);
		inf.setuRegisterTime(new Date());
		infoService.save(inf);
	}

	@Test
	// @Rollback
	public void updateTest() {
		UserInfo inf = infoService.getById(33);
		inf.setUname("5464fdgdf");
		infoService.save(inf);
	}


	@Test
	public void getById(){
		UserInfo u = infoService.getById(1);
		System.out.println(u);
	}
}
