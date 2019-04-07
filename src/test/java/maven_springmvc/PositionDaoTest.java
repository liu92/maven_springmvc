package maven_springmvc;

import com.alibaba.fastjson.JSON;
import com.springmvc.po.Position;
import com.springmvc.service.HelloSevice;
import com.springmvc.service.PositionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext_test.xml")
@Transactional
public class PositionDaoTest {

    @Autowired
    private PositionService positionService;

    @Autowired
    ApplicationContext context;


    @Test
    public void add(){
        for (int i=0; i<5;i++){
            Position position = new Position();
            position.setName("3232"+i);
            position.setOrderNo(2+i);
            positionService.add(position);
        }

    }

    @Test
    public void findAll(){
        List<Position> positions=positionService.findAll();
        System.out.println(JSON.toJSON(positions));
    }

    @Test
    public  void  getContext(){

        JdbcTemplate applicationName = (JdbcTemplate) context.getBean("jdbcTemplate");

        String[] aliases = context.getAliases("");
        System.out.println("容器中有哪些bean============"+applicationName);

        //得到bean的别名，如果根据别名检索，那么其原名也会被检索出来
        System.out.println("aliases是什么======"+aliases);

        HelloSevice helloSevice = (HelloSevice) context.getBean("helloSevice");

        System.out.println("helloSevice是否在容器中===="+helloSevice);
    }

}