package blog.dao.Test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import blog.dao.BloggerDao;
import blog.entity.Blogger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class BloggerDaoTest {
	
	@Resource
	private BloggerDao bloggerDao;
	
	@Test
	public void getBloggerData() throws Exception{
		Blogger blogger = bloggerDao.getBloggerData();
		System.out.println(blogger);
	}
	
}
